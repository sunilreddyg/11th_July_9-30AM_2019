package extent_Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Facebook 
{

	public static void main(String[] args) 
	{
		String path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\src\\extent_Reports\\MyReports.html";
		//Create object for extent reports
		ExtentReports reporter=new ExtentReports(path, true);
		
		//Create Report for Test
		ExtentTest test1=reporter.startTest("Tc001_Facebook_login_Invalid");
		
					//Set Runtime environment variable for chrome driver
					String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
					System.setProperty("webdriver.chrome.driver", chrome_path);
										    
					//browser initiation
					WebDriver driver=new ChromeDriver();
					test1.log(LogStatus.INFO, "Browser launched");
					
					driver.get("http://facebook.com");
					test1.log(LogStatus.INFO, "Browser launched");
					
					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					test1.log(LogStatus.INFO, "Implicit time assigned 50 seconds");
					
					driver.manage().window().maximize();
					test1.log(LogStatus.INFO, "Browser window maximized");
					
					
					driver.findElement(By.id("email")).clear();
					driver.findElement(By.id("email")).sendKeys("9030248855");
					test1.log(LogStatus.INFO, "email enter successfull");
					
		
		reporter.endTest(test1);
		
		
		reporter.flush();
	}

}
