package capture_sceen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Interface {

	public static void main(String[] args) throws IOException
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
		
				
		//capture screen and conver into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Access fileutils to dump screen at local folders
		FileUtils.copyFile(src, new File("screens\\image.png"));
		
		/*
		 * Disadvantage of screen Capture at selenium-webdriver:-->
		 * 		1. Can't take screenshot when alert presented
		 * 		2. Only Capture Visible Interface [Top Interface]
		 * 		3. Image Override everytime, Incase File name not changed.
		 */
		
		

	}

}
