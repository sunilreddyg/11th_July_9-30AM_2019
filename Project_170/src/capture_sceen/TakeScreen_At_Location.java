package capture_sceen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreen_At_Location {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize();    
		
		//Target Location
		WebElement Location=driver.findElement(By.xpath("//a[contains(@id,'anc')]"));
		new Actions(driver).moveToElement(Location).build().perform();
		Thread.sleep(3000);
		
		//Capture screen and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//dump file into local utilities
		FileUtils.copyFile(src, new File("screens\\Targetimage.png"));
		
		
		

	}

}
