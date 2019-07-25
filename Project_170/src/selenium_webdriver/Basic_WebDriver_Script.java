package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver_Script 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://facebook.com");    //Load webpage to browser
		
		//Identify email editbox and type text into editbox..
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		
		//idebtify password editbox and type text into editbox
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello123456");
		
		//Identify Login button and perform click
		driver.findElement(By.id("loginbutton")).click();
		
		

	}

}
