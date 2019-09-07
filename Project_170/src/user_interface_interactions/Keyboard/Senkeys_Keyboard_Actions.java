package user_interface_interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senkeys_Keyboard_Actions 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//click course list to display list of options
		driver.findElement(By.xpath("//input[@name='course']")).click();
		Thread.sleep(2000);  //Static timeout
		
		//keyboard actions on automation browser
		new Actions(driver).sendKeys(Keys.chord("MCA"))
		.pause(2000).sendKeys(Keys.TAB).perform();
		
		
		//Type referral text into editbox
		driver.findElement(By.xpath("//input[@id='ql']")).clear();
		driver.findElement(By.xpath("//input[@id='ql']")).sendKeys("HYD");
		//Keyboard action on automation
		new Actions(driver)
		.sendKeys(Keys.ARROW_DOWN).pause(2000).sendKeys(Keys.ENTER).perform();
		
		
		//keybaord action on automation browser
		new Actions(driver).sendKeys(Keys.TAB)
		.pause(1000).sendKeys("java").sendKeys(Keys.ENTER).perform();
				
		
		

	}

}
