package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		
		//Set implicit wait for page
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)
		.pageLoadTimeout(30, TimeUnit.SECONDS)
		.setScriptTimeout(40, TimeUnit.SECONDS);
		
		//Load webpage to browser window
		driver.get("http://facebook.com");
		//Maximize browser window
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
