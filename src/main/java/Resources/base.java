package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop; 

	public WebDriver initializeDriver() throws IOException {
		prop 					= new Properties();
		FileInputStream fis 	= new FileInputStream("C:\\Work\\BlueStone_FinalFrameWork-master\\src\\main\\java\\Resources\\property.properties");
		prop.load(fis);
		String browserName 		= prop.getProperty("browser");
		
		
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	
		else if (browserName.equals("Edge"))
		{
		System.setProperty("webdriver.edge.driver", "C:\\WORK_\\Edge\\msedgedriver");  
		driver = new InternetExplorerDriver();
		}
				
		
		else
		{
		System.out.println("Please give the correct Browser Name in Properties tag");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenShotPath(String testMethodName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts     = (TakesScreenshot) driver;
		File			source = ts.getScreenshotAs(OutputType.FILE);		
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testMethodName+".png";
		//FileUtils.copyFile(source,new File(destinationFile));
		org.apache.commons.io.FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
	}
	


}
