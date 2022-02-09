package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common_Functions.SeleniumEasy_CommonFunctions;
import Resources.base;
import pageObjectModel.SeleniumEasy_Landing_Page;

public class Selenium_Easy_Regression_TestCases extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
@BeforeMethod
public void Invoke_Browser() throws IOException {
	driver = initializeDriver();
	// WebDriver driver = new ChromDriver();
	log.info("Browse has be Intialized Successfully");
	
	driver.get(prop.getProperty("url_SeleniumEasy"));
	log.info("Launched " +prop.getProperty("url_SeleniumEasy"));
	
	driver.manage().window().maximize();
	log.info("Maximized Window");	
}
	
@Test
public void Valdiate_user_able_Submit_Simple_Fomr() throws InterruptedException {
	log.info("Test Case - Valdiate_user_able_Submit_Simple_Fomr ");
	
	SeleniumEasy_Landing_Page SE 			= new SeleniumEasy_Landing_Page(driver);
	
	
	SeleniumEasy_CommonFunctions   SECommonFun  = new SeleniumEasy_CommonFunctions();
	SECommonFun.SeleniumEasy_PopUp_Handle(SE.getPopUp_NothanksButton());
	SE.getStartPrctBtn().click();
	SE.getsimpleFormLnk().click();
	String ActualStr = "Mr.Zakir Hussain Shaik";	
	SE.getEnterMsg_Txt().sendKeys(ActualStr);
	SE.getShowMsg_Btn().click();
	String ExpectedStr = SE.getDisplayedMsg_Txt().getText();
	Assert.assertEquals(ActualStr, ExpectedStr);	
}



@AfterMethod
public void tearDown() {	
	driver.close();
	log.info("Closed the browser Successfully");
	
}






}



