package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FB__Home_Page {
	
	//Commont for every Page
	
	
	public WebDriver driver;

	public FB__Home_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By Groups_btn = By.xpath("//span[text()='Groups']");
	public WebElement getGroups_btn(){
	return driver.findElement(Groups_btn);
	}	
	
	
	By MarketPlace = By.xpath("//span[text()='Marketplace']");
	public WebElement getMarketPlace(){
	return driver.findElement(MarketPlace);
	}	
	
	
	
	
	
	
	

}
