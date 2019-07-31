package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Options {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
					

		//Select dropdown option using visible text.
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		
		Thread.sleep(4000);  //Static timeout to load cities
		
		//Select dropdown option using value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		Thread.sleep(4000);  //Static timeout
		
		
		//Select dropdown option using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(4); //Index number should declare in integer format
		

		//Select checkbox
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		//Click button
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
	}

}
