package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourStore_Home_Page {
	
	//Commont for every Page
	
	
	public WebDriver driver;

	public YourStore_Home_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
		
	By myAccount_btn = By.xpath("//span[text()='My Account']");	
	public WebElement get_myAccount_btn(){	
	return driver.findElement(myAccount_btn);	
	}	

	
	By Register_btn = By.xpath("//a[text()='Register']");	
	public WebElement get_Register_btn(){			
	return driver.findElement(Register_btn);	
	}	
	
	
	
	
	

}
