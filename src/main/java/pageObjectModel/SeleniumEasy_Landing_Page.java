package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasy_Landing_Page {

public WebDriver driver;

public SeleniumEasy_Landing_Page(WebDriver driver)
{
	this.driver = driver;
}
	
By PopUp_NothanksButton = By.xpath("//a[text()='No, thanks!']");
public WebElement getPopUp_NothanksButton(){
return driver.findElement(PopUp_NothanksButton);
}

//sTART PRACTISER
By StartPrctBtn = By.xpath("//a[@id='btn_basic_example']");
public WebElement getStartPrctBtn(){
return driver.findElement(StartPrctBtn);
}


//sIMPLE fORM demO 
By simpleFormLnk = By.xpath("//a[text()='Simple Form Demo' and @class ='list-group-item']");
public WebElement getsimpleFormLnk() 
{
return driver.findElement(simpleFormLnk);
}



//Enter Message 
By EnterMsg_Txt = By.xpath("//input[@id ='user-message']");
public WebElement getEnterMsg_Txt() {
	return driver.findElement(EnterMsg_Txt);
}

By ShowMsg_Btn = By.xpath("//button[text()='Show Message']");
public WebElement getShowMsg_Btn() {
	return driver.findElement(ShowMsg_Btn);
}

By DisplayedMsg_Txt = By.xpath("//span[@id='display']");
public WebElement getDisplayedMsg_Txt() {
	return driver.findElement(DisplayedMsg_Txt);
}

}
