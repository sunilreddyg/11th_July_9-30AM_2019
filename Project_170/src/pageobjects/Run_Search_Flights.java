package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Run_Search_Flights {

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
		
		Sflight.Verify_Expected_Header_Visibility(); //Method from pagefactory class
		
		Sflight.Roundtrip_Rbtn.click();   			//Element from page factory class
		
		Sflight.From_EB.clear();
		Sflight.From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Sflight.Hyd_City_Airport.click();
		
		Sflight.Arrival_EB.clear();
		Sflight.Arrival_EB.sendKeys("D"+Keys.ARROW_DOWN+"EL");
		Sflight.Delhi_City_Airport.click();
		
		
		

	}

}
