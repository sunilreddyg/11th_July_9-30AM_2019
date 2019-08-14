package webdriver_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text_And_Attribute_Example {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
				
		
		/*
		 * identify Location using element text
		 * HtmlSource:-->
		 * 		<button id="cjaMain">Create a Job Alert</button>
		 * Syntax:--.
		 * 		//tagname[text()='ElementText']
		 * 
		 * Note:-->
		 * 		text()  or .[dot] keywords target Element Text area at hmtl-node
		 */
		
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
		/*
		 * Identify location using Element Attributes
		 * HtmlSource:-->
		 * 			<input class="sugInp" name="keyskills" type="text">
		 * Syntax:-->
		 * 			//tagname[@Propertyname='PropertyValue']
		 * 
		 *  Note:-->
		 *  		@ symbol identify only attributes at html-node
		 */
		driver.findElement(By.xpath("//input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//input[@name='keyskills']")).sendKeys("software testing");
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[.='Cucumber']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
