package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class IPL_ScorePage {

	public WebDriver driver;
	public IPL_ScorePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
			
	By ListofTeams = By.xpath("//tr[@jscontroller='cvgK0e']//td[3]//span");
	public List<WebElement> getListofTeams(){
	return driver.findElements(ListofTeams);
	}	

	
	By ListOfPoints = By.xpath("//tr[@jscontroller='cvgK0e']//td[8]");
	public List<WebElement> getListOfPoints(){
	return driver.findElements(ListOfPoints);
	}	
	
	
	By WinsLosses = By.xpath("//tr[@jscontroller='cvgK0e']//td[9]//div[@class='YCyuEf']");
	public List<WebElement> GetWinsLosses(){
	return driver.findElements(WinsLosses);
	}	
	
	
	
	
	

}
