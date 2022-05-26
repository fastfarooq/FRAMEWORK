package testCases;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObjectModel.Google_HomePage;
import pageObjectModel.IPL_ScorePage;


public class IPL_ScoreBoard extends base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	
	@BeforeMethod
	public void LaunchApp() throws IOException {
		
		driver = initializeDriver();
		log.info("Browse has be Intialized Successfully");		
		driver.get(prop.getProperty("url"));
		log.info("Launched " +prop.getProperty("url"));		
		driver.manage().window().maximize();
		log.info("Maximized Window");
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		driver.close();
		log.info("Closed the Browser Successfully");
	}	
	

@Test(priority=1)
public void TeamNamePoints() throws IOException, InterruptedException
{	
	log.info("Test Case - Valdiate_login_Functionality_Invalid_data ");
	Google_HomePage HomePage = new Google_HomePage(driver);
	IPL_ScorePage ScorePage  = new IPL_ScorePage(driver);
	HomePage.getSearchTextBox().sendKeys("ipl score board");
	HomePage.getSearchTextBox().sendKeys(Keys.ENTER);
	HomePage.gettableLink().click();
	List<WebElement> TeamNames  = ScorePage.getListofTeams();
	List<WebElement> TeamPoints = ScorePage.getListOfPoints();
	List<WebElement> WinsLosses = ScorePage.GetWinsLosses();
	
	HashMap<String,Integer> HashMap_TeamPoints 		= new HashMap<String,Integer>();
	HashMap<String,Integer> HashMap_TeamWinsLosses  = new HashMap<String,Integer>();
	
	
	for( int i=0; i<10; i++)
	{	String name  = TeamNames.get(i).getText();
		String tempPoint = TeamPoints.get(i).getText();
		int point = Integer.parseInt(tempPoint);		
		HashMap_TeamPoints.put(name, point);
		
	}
	System.out.println(HashMap_TeamPoints);
	
	int win=0,loss=0;
	int total =0;
	
	
	int count= 5;
	for(int j=0; j<50; j++)
	{
		String temptext = WinsLosses.get(j).getText();
		if(temptext.equalsIgnoreCase("Win"))
		{
			win=win+1;
		}
		else
		{
			loss=loss+1;
		}
		total=loss+win;
		
		if(total>=count)
		{
		System.out.println("Wins = " +win +"Loss = " +loss);
		System.out.println();
		win=0;
		loss=0;
		}
		
	}
		
		
		
			
	}
	
	

}



	
/*
@Test(dataProvider="getData")
public void Valdiate_login_Functionality_valid_data(String userID, String Password) throws IOException, InterruptedException
{
	driver = initializeDriver();
	driver.get(prop.getProperty("url_fb"));
	Fb_Login_Page FbLgnPage = new Fb_Login_Page(driver);
	FbLgnPage.getEnglish_lnk().click();
	FbLgnPage.getUserName_txtBox().sendKeys(userID);
	FbLgnPage.getPassWord_txtBox().sendKeys(Password);
	FbLgnPage.getlogin_Btn().click();
	Thread.sleep(3000);
	driver.close();
}

@DataProvider
public Object[][] getData() 
{
	//[3] = 3 sets  
	//[2] = 2 Values in each set
	Object[][] data = new Object[3][2];
	
	data[0][0] = "9030212608"; 	
	data[0][1] = "Wrongpassword";
	
	data[1][0] = "tester";
	data[1][1] = "tester";
	
	data[2][0] = "903021268";
	data[2][1] = "tester";
	
	return data;	
}

	
*/	


