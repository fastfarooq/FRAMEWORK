package Resources;
import java.text.SimpleDateFormat;
import java.util.Date;




import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		
	//Getting the date so that we can add the same in Report
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
	    	
	//user.dir will give you the root location of the folder(FRAMEWORK) in this case
		String 				path 	 = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); 
		reporter.config().setReportName("BlueStone Education - Test Results");
		reporter.config().setDocumentTitle("Automation Test Results ");		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
	//All these details will be added in the Report
		extent.setSystemInfo("Company Name", "BlueStone Education");
		extent.setSystemInfo("Tester Name", "Mr. Zakir Hussain Shaik");
		extent.setSystemInfo("Date", formatter.format(date));
		
		return extent;
		
		
		
	}

}
