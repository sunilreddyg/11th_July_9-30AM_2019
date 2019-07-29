package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Actions {

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
	
		driver.findElement(By.name("firstname"))
		.sendKeys("Rahul"+Keys.TAB
				+"Raghav"+Keys.TAB
				+"RahulRaghav@gmail.com"+Keys.TAB
				+"RahulRaghav@gmail.com"+Keys.TAB
				+"Hello123456");
		
		
		//Select dropdown using keyboard shortcut
		driver.findElement(By.id("day")).sendKeys("15");
		
		
		//Select dropdown using keyboard shortcut
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//seelct radio button using keyboard shortcut
		driver.findElement(By.xpath("//input[@value='1']"))
		.sendKeys(Keys.SPACE);
		
		

	}

}
