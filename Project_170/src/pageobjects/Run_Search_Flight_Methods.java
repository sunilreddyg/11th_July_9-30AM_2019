package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Search_Flight_Methods 
{

	public static void main(String[] args) throws Exception
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//To Identify @FindBy elements we need to create object for Page-factory class.
		Search_Flights Sflight=PageFactory.initElements(driver, Search_Flights.class);
		
		
		/*
		 * Testcase:--> Verify Home Error msg displayed on empty Search
		 */
		Sflight.Verify_Expected_Header_Visibility();
		Sflight.Flight_Search_btn.click();
		Sflight.Verify_Home_error_msg_displayed_on_Empty_Search();
	}

}
