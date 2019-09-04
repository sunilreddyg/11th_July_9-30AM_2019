package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_BetWeen_Frames {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");       //Load webpage
		driver.manage().window().maximize();    		  //maximize browser window
				
		//Switch to Frmesource from page source
		driver.switchTo().frame("packageListFrame");
	
		//Identify link under frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//Switch control back to mainpage
		driver.switchTo().defaultContent();
		
		//Switch to  next frame
		driver.switchTo().frame("packageFrame");
		
		//click Link under frame
		driver.findElement(By.linkText("Alert")).click();
		
		
	}

}
