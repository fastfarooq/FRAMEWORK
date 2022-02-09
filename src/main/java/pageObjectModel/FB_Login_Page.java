package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FB_Login_Page {

	public WebDriver driver;
	public FB_Login_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By English_lnk		= By.xpath("//a[text()='English (UK)']");
	By UserName_txtBox 	= By.xpath("//input[@id='email']");	
	By login_Button 	= By.xpath("//button[@name='login']");
	By ErrorMsg_txt 	= By.xpath("//a[text()='Find your account and log in.']");
	By FbUserName_txt   = By.xpath("//span[text()='Gudiya Honey']");
	
	public WebElement getEnglish_lnk()
	{return driver.findElement(English_lnk);}
	
	
	By PassWord_txtBox 	= By.xpath("//input[@id='pass']");
	
	
	public WebElement getPassWord_txtBox()
	{
		return driver.findElement(PassWord_txtBox);	
	}
	
	public WebElement getUserName_txtBox()
	{return driver.findElement(UserName_txtBox);}
	
	public WebElement getlogin_Btn()
	{return driver.findElement(login_Button);}
	
	public WebElement getErrorMsg_txt()
	{return driver.findElement(ErrorMsg_txt);}
	
	public WebElement getFbUserName_txt()
	{return driver.findElement(FbUserName_txt);}
	
	
	

}
