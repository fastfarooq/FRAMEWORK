package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourStore_Register_Page {
	
	//Commont for every Page
	
	
	public WebDriver driver;

	public YourStore_Register_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By FirstName_txtbox = By.xpath("//input[@id='input-firstname']");	
	public WebElement get_FirstName_txtbox(){			
	return driver.findElement(FirstName_txtbox);
	}	

	By LastName_txtbox = By.xpath("//input[@id='input-lastname']");	
	public WebElement get_LastName_txtbox(){			
	return driver.findElement(LastName_txtbox);
	}	

	By Email_txtBox = By.xpath("//input[@id='input-email']");	
	public WebElement get_Email_txtBox(){			
	return driver.findElement(Email_txtBox);
	}
	
	By Telephone_txtBox = By.xpath("//input[@id='input-telephone']");	
	public WebElement get_Telephone_txtBox(){			
	return driver.findElement(Telephone_txtBox);
	}
	
	By Password_txtBox = By.xpath("//input[@id='input-password']");	
	public WebElement get_Password_txtBox(){			
	return driver.findElement(Password_txtBox);
	}
	
	By ConfirmPassword_txtBox = By.xpath("//input[@id='input-confirm']");	
	public WebElement get_ConfirmPassword_txtBox(){			
	return driver.findElement(ConfirmPassword_txtBox);
	}
	
	By Policy_chkBox = By.xpath("//input[@name='agree']");	
	public WebElement get_Policy_chkBox(){			
	return driver.findElement(Policy_chkBox);
	}
	
	
	By Continue_Btn = By.xpath("//input[@value='Continue']");	
	public WebElement get_Continue_Btn(){			
	return driver.findElement(Continue_Btn);
	}
	
	
	
	
	
	

}
