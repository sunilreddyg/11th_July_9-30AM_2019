package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");       //Load webpage
		driver.manage().window().maximize();    		  //maximize browser window
		
		
		//Switch to frame 
		driver.switchTo().frame("modal_window");
		
		WebElement Email_EB=driver.findElement(By.xpath("//input[@id='email']"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		
		WebElement Trip_ID_EB=driver.findElement(By.id("tripidSecond"));
		Trip_ID_EB.clear();
		Trip_ID_EB.sendKeys("123012312");
		
		
		//Get Control back to mainpage form page
		driver.switchTo().defaultContent();
		
		//Identify link at webpage
		driver.findElement(By.linkText("Flights")).click();
		
	}

}
