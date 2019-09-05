package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Command {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");       //Load webpage
		driver.manage().window().maximize();    		  //maximize browser window
		
		
		//Without apply switch navigate to frame
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");

		
		WebElement Email_EB=driver.findElement(By.xpath("//input[@id='email']"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		
		WebElement Trip_ID_EB=driver.findElement(By.id("tripidSecond"));
		Trip_ID_EB.clear();
		Trip_ID_EB.sendKeys("123012312");
		
		
		//navigate back to frame
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		
	}

}
