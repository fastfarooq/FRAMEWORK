package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class FB__Home_Page {
	

	
	@FindBy(xpath = "//span[text()='Groups']")
	private WebElement GroupsLink;
	
	
	
	public WebDriver driver;
	public FB__Home_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
