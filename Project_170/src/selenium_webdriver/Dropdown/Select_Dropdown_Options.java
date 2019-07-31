package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
			

		//Select day option using visible text
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("aa");
		
	
		//select month option using value property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("10");
		
		
		//Select year option using index value.
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(8);
		
		
		
		
				

	}

}
