package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjectModel.TestDemo_Home_Page;

public class TestDemoApplication_Regression_TestCases extends base  {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeMethod
	public void OpenBrowser_url() throws IOException {
		driver = initializeDriver();
		log.info("Browse has be Intialized Successfully");
		
		driver.get(prop.getProperty("url_TestDemo"));
		log.info("Launched " +prop.getProperty("url_TestDemo"));
		
		driver.manage().window().maximize();
		log.info("Maximized Window");	
		}
		

	@AfterMethod
	public void teardown() throws InterruptedException {	
		Thread.sleep(3000);
		driver.close();
		log.info("Closed the browser Successfully");
	}
	

	 
	@Test
	public void Validate_Context_Message() throws IOException, InterruptedException
	{	
		log.info("Test Case - Validate_Context_Message ");
		TestDemo_Home_Page HP = new TestDemo_Home_Page(driver);
		Actions 					  AC = new Actions(driver);		
		HP.getcontext_lnk().click();
		AC.contextClick(HP.getcontext_area()).build().perform();
		String Runtime = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		HP.getcontext_area().click();
		Assert.assertEquals(Runtime, "You selected a right menu", "FAIL-Message does not match with req");
	}
 
	
	
	 
	@Test
	public void Validate_User_is_Able_to_Enter_MobileNumber() throws IOException, InterruptedException
	{	
		log.info("Validate_User_is_Able_to_Enter_MobileNumber ");
		TestDemo_Home_Page HTest = new TestDemo_Home_Page(driver);
		
		HTest.getinputs().click();
		HTest.getnumberTextBox().sendKeys("9642869539");
			
		
	}
	 

}
