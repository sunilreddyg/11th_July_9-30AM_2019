package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Elements_With_Xpath 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Krishna");

	}

}
