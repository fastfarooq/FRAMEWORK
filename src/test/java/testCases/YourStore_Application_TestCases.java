package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.base;
import pageObjectModel.YourStore_Home_Page;
import pageObjectModel.YourStore_Register_Page;

public class YourStore_Application_TestCases extends base{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Valdiate_Account_Registration() throws InterruptedException {
	//Creating a Object for Home Page
		YourStore_Home_Page HomePage = new YourStore_Home_Page(driver);		
		HomePage.get_myAccount_btn().click();		
		HomePage.get_Register_btn().click();
		
	//Creating a Object for Register Page	
		YourStore_Register_Page RegPage = new YourStore_Register_Page(driver);
		RegPage.get_FirstName_txtbox().sendKeys("Zakir");
		RegPage.get_LastName_txtbox().sendKeys("Shaik");
		RegPage.get_Email_txtBox().sendKeys("bluestonecompnay@trust.com");
		RegPage.get_Telephone_txtBox().sendKeys("1122334455");
		RegPage.get_Password_txtBox().sendKeys("test");
		RegPage.get_ConfirmPassword_txtBox().sendKeys("test");
		RegPage.get_Policy_chkBox().click();
		RegPage.get_Continue_Btn().click();				
	}
	
	
	@Test
	public void Validate_New_Login() {
		
		//tEST cASE
	}
	
	
	
	//Test Case
	
	@BeforeMethod
	public void Invoke_Browser() throws IOException, InterruptedException {
		driver = initializeDriver();
		log.info("Browse has be Intialized Successfully");		
		driver.get(prop.getProperty("url_YourStore"));
		driver.navigate().refresh();
		Thread.sleep(10000);
		log.info("Launched " +prop.getProperty("url_YourStore"));		
		driver.manage().window().maximize();
		log.info("Maximized Window");	
		}
	

	@AfterMethod
	public void tearDown() throws InterruptedException {			
		Thread.sleep(4000);
		driver.close();
		log.info("Closed the browser Successfully");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
