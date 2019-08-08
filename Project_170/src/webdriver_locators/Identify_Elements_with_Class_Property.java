package webdriver_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Elements_with_Class_Property 
{

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.outlook.com");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		
		//Identify location with class property
		driver.findElement(By.className("linkButtonSigninHeader")).click();
		

		/*
		 * Identify location with class property when define along with spaces:-->
		 * 
		 *   <input class="ltr_override liveDomainInput col-xs-14">
		 *   
		 *   Note:--> don't define class property along with spaces
		 */
		driver.findElement(By.className("liveDomainInput")).clear();
		driver.findElement(By.className("liveDomainInput")).sendKeys("info.dsnr123");
		
		
		driver.findElement(By.id("iSignupAction")).click();
	}

}
