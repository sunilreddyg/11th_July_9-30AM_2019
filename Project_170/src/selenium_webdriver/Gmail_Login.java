package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login 
{

	public static void main(String[] args) throws Exception
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://gmail.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		//Type email and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		
		Thread.sleep(5000);  //Static timeout to load password
		
		//type password and press enter key
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password"))
		.sendKeys("Hello12345"+Keys.ENTER);
		
		
		
		
		
		
	}

}
