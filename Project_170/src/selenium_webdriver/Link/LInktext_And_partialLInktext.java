package selenium_webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInktext_And_partialLInktext 
{

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		/*
		 * Click link with original linkname
		 * 
		 * 	HtmlSource:--->
		 * 			<a href="/about" title="About Us" >About Us</a>
		 * 
		 */
		driver.findElement(By.linkText("About Us")).click();
		
		/*
		 * click link with original linkname
		 * HtmlSource:-->
		 * 			<a href="/jobs">Jobs</a>
		 */
		driver.findElement(By.linkText("Jobs")).click();
		
		
		/*
		 * click link with original linkname
		 * HtmlSource:-->
		 * 			<a href="/jobs/openings">Job Openings</a>
		 */
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		/*
		 * click link with partial linktext
		 * HtmlSource:-->
		 * 			<a href="https://www.cleartrip.com//executive-travel-desk-implant/">
		 * 					<strong>Executive – Travel Facilitator (Implant)</strong>
				            <span class="location">Mumbai, </span>
				            <span class="location">Noida</span>		
				    </a>
		 */
		driver.findElement(By.partialLinkText("Executive – Travel Facilitator (Implant)")).click();
		
		
		/*
		 * click link with link  text
		 * 
		 * Htmlsource:-->
		 * 		<a rel="bToolTip" title="Flights" href="/flights">
		 * 			<span class="productIcon flights">Flights</span>
		 *      </a>
		 */
		driver.findElement(By.linkText("Flights")).click();

	}

}
