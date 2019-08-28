package ui_ValidationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.gmail.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
								
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
		//Writing decision statement to accept on element visible & Enabled
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		}
		else
		{
			System.out.println("Element not visible/enabled");
		}
		
	
		Thread.sleep(5000); //Static timeout to load password element
		
		
		//Identifying password element
		WebElement Password_EB=driver.findElement(By.name("password"));
		if(Password_EB.isDisplayed() && Password_EB.isEnabled())
		{
			Password_EB.clear();
			Password_EB.sendKeys("Hello");
		}
		else
		{
			System.out.println("password editbox was not visible/enabled");
		}
		

		/*
		 * ElementNotvisibleException   
		 * 			==> When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
