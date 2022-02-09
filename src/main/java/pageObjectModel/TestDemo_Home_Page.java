package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestDemo_Home_Page {
	
	public WebDriver driver;
	
	public TestDemo_Home_Page(WebDriver driver) {
	this.driver = driver;	
	}
 

	By CheckBox_LandingPage = By.xpath("//a[text()='Checkboxes']");
	public WebElement getCheckBox_LandingPage()
	{
		return driver.findElement(CheckBox_LandingPage);
	}
	
	
	By context_lnk = By.xpath("//a[text()='Context Menu']");
	public WebElement getcontext_lnk()
	{
		return driver.findElement(context_lnk);
	}
	
	
	By context_area = By.xpath("//div[@id='hot-spot']");
	public WebElement getcontext_area()
	{
		return driver.findElement(context_area);
	}
	
	By inputs = By.xpath("//a[text()='Inputs']");
	public WebElement getinputs()
	{
		return driver.findElement(inputs);
	}
		
	
	By numberTextBox = By.xpath("//input[@type='number']");
	public WebElement getnumberTextBox()
	{
		return driver.findElement(numberTextBox);
	}
	

}
