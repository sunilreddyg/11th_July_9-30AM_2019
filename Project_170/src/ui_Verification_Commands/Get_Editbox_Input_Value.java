package ui_Verification_Commands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Editbox_Input_Value {

	public static void main(String[] args)
	{
		/*
		 * Scenario:-->
		 * 			Verify departure date at flight booking scenario,
		 * 			Always display date as current system date.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	 //Launch browser
		driver.get("https://www.spicejet.com");  //Load webpage
		driver.manage().window().maximize();     //maximize browser window
						
		
		//Identify Deapature date editbox
		WebElement Departure_Date_EB=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		//Capture input text available from editbox
		String Ddate=Departure_Date_EB.getAttribute("value");
		System.out.println(Ddate);
		
		//Capture current system date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//using simple date formatter convert system date
		String Sdate=sdf.format(d);
		System.out.println("System date after convertion => "+Sdate);
		
		//Decision statement to verify Systemdate and DepartureDate
		if(Ddate.equals(Sdate))
			System.out.println("Match found");
		else
			System.out.println("date mismatch");
		
		

	}

}
