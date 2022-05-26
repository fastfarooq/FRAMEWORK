package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Google_HomePage {

	public WebDriver driver;
	public Google_HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	
	By SearchTextBox = By.xpath("//input[@name='q']");
	public WebElement getSearchTextBox(){
	return driver.findElement(SearchTextBox);
	}	
	
	By tableLink = By.xpath("//li[text()='TABLE']");
	public WebElement gettableLink(){
	return driver.findElement(tableLink);
	}	
	
	
	
	
	
	
	
	

}
