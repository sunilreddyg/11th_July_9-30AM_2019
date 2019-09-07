package user_interface_interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Actions 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.amazon.in/");             //Load webpage
		driver.manage().window().maximize();              //maximize browser window
		
		
		//Identify element at location
		WebElement Main_Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		
		
		/*
		 * Note:-->
		 * 			Inorder to use keyboard and mouse interactions, we 
		 * 			need to create object for  "Actions" class
		 */
		
		//Perform hover action on main category
		new Actions(driver).moveToElement(Main_Category).perform();
		
		//Perform hover action on locationsub category mobiles and computers
		Thread.sleep(3000);
		WebElement Sub_Mobiles_And_Computers=driver.findElement
				(By.xpath("//span[@class='nav-text'][contains(.,'Mobiles, Computers')]"));
		
		new Actions(driver).moveToElement(Sub_Mobiles_And_Computers).perform();
		
		
		

	}

}
