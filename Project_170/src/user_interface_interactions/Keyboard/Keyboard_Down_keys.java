package user_interface_interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Down_keys {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	
		//Press Cntrl+S shortcut
		WebElement Surname=driver.findElement(By.name("lastname"));
		Surname.clear();
		Surname.sendKeys("123456");
		
		
		new Actions(driver).pause(3000)
		.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys("Hi").perform();
		
		
	

	}

}
