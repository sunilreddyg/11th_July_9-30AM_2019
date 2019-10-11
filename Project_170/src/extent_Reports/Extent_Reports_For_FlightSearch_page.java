package extent_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_For_FlightSearch_page 
{

	public static void main(String[] args) throws Exception 
	{
		
		String filepath="C:\\Users\\Administrator\\git\\11th_July_9-30AM_2019\\Project_170\\src\\extent_Reports\\";
		//Create object for extent reports
		ExtentReports reports=new ExtentReports(filepath+"FlighSearch.html", true);

		
		//Crete reports for individual test.
		ExtentTest Tc001=reports.startTest("Tc001_Search_Flights");
		
			System.setProperty("webdriver.chrome.driver", "chrome_driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Tc001.log(LogStatus.INFO, "Browser launched");
			
			driver.get("https://www.cleartrip.com/");
			Tc001.log(LogStatus.INFO, "Webpage loaded to browser window");
			
			driver.manage().window().maximize();
			Tc001.log(LogStatus.INFO, "Window maximized");
			
			driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
			Tc001.log(LogStatus.INFO, "Roundtrip radio button selected");
			
			WebElement From_EB=driver.findElement(By.xpath("//input[@id='FromTag']"));
			From_EB.clear();
			From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
			Tc001.log(LogStatus.INFO, "HYD referral send successfull at From Editbox");
			
			Thread.sleep(4000);
			Tc001.log(LogStatus.INFO, "Static timegap released after 4 seconds");
			
			driver.findElement(By.xpath("//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")).click();
			Tc001.log(LogStatus.INFO, "From City option selected");
			
			String Exp_city="Hyderabad, IN - Rajiv Gandhi International (HYD)";
			String Act_City=From_EB.getAttribute("value");
			
			
		
			if(Act_City.equals(Exp_city))
				Tc001.log(LogStatus.PASS, "Expected City Selected");
			else
				Tc001.log(LogStatus.FAIL, "Expected City not Selected");
			
			
			
			
		reports.endTest(Tc001);
		
		
		//Create File with reports
		reports.flush();
	}

}
