package testCases;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.sun.tools.sjavac.Log;
import Resources.base;
import pageObjectModel.FB_Login_Page;
import pageObjectModel.FB__Home_Page;

public class FaceBook_Regression_TestCase extends base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

@Test(priority=1)
public void TestCase_01() throws IOException, InterruptedException
{	
	log.info("Test Case - Valdiate_login_Functionality_Invalid_data ");
	FB_Login_Page FbLgnPage = new FB_Login_Page(driver);
	//FbLgnPage.getEnglish_lnk().click();
	FbLgnPage.getUserName_txtBox().sendKeys("9642869539");
	FbLgnPage.getPassWord_txtBox().sendKeys("1626");
	FbLgnPage.getlogin_Btn().click();
	Thread.sleep(3000);
}


@Test(priority=2)
public void TestCase_02() throws IOException, InterruptedException
{
	log.info("Test Case - Valdiate_login_Functionality_Blank_data ");
	FB_Login_Page FbLgnPage = new FB_Login_Page(driver);
	//FbLgnPage.getEnglish_lnk().click();
	FbLgnPage.getUserName_txtBox().sendKeys("");
	FbLgnPage.getPassWord_txtBox().sendKeys("");
	FbLgnPage.getlogin_Btn().click();
	Thread.sleep(3000);	
}

@Test(priority=3)
public void TestCase_03() throws IOException, InterruptedException
{	
	FB_Login_Page FbLgnPage = new FB_Login_Page(driver);
	//FbLgnPage.getEnglish_lnk().click();
	FbLgnPage.getUserName_txtBox().sendKeys("9642869539");
	FbLgnPage.getPassWord_txtBox().sendKeys("tester*1626");
	FbLgnPage.getlogin_Btn().click();
	Thread.sleep(3000);
}

@BeforeMethod
public void LaunchApp() throws IOException {
	
	driver = initializeDriver();
	log.info("Browse has be Intialized Successfully");
	
	driver.get(prop.getProperty("url_fb"));
	log.info("Launched " +prop.getProperty("url_fb"));
	
	driver.manage().window().maximize();
	log.info("Maximized Window");
}

@AfterMethod
public void tearDown() {
	driver.close();
	log.info("Closed the Browser Successfully");
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

}
