package capture_sceen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_With_TimeStamp {

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
		
		
		//Capture Current System Date in default format
		Date d=new Date();   //import java.util;
		//Create simple date format
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/EEE/dd/ hh-mm-ss");
		//Using simple date format convert system default date
		String time=df.format(d);
		
		//Capture screen and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//dump file into local utilities
		FileUtils.copyFile(src, new File("screens\\"+time+"Targetimage.png"));
				

	}

}
