package javascript;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor_Highlight_element 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.facebook.com/");       
		driver.manage().window().maximize();  
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identify element
		WebElement text_location=driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
		
		//Highlight text using jsexecutor
		js.executeScript("arguments[0].style.backgroundColor='yellow'",text_location);
		
		//Set outline for text
		js.executeScript("arguments[0].style.outline ='red solid 2px'",text_location);
		Thread.sleep(5000);
		
		
		//get default system date
		Date d=new Date();
		//Create simple date format..
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/EEE/dd/ hh-mm-ss");
		//Using date formatter convert system date
		String time=sdf.format(d);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
		

		//Page refresh
		Thread.sleep(5000);
		driver.navigate().refresh();
		

		
	}

}
