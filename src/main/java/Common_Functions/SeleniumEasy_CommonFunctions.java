package Common_Functions;

import org.openqa.selenium.WebElement;

public class SeleniumEasy_CommonFunctions {
	
	public void SeleniumEasy_PopUp_Handle(WebElement element) throws InterruptedException {
	Thread.sleep(5000);	
	if(element.isDisplayed())
	{
		element.click();
		System.out.println("Opened the Selenium Easy Home Page");
	}
	else
	{
		System.out.println("Opened the Selenium Easy Home Page");
	}
		
	}

}
