package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Source_At_Webpage
{

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://gmail.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
			
		
		//Get Runtime page source
		String Runtime_pageSource=driver.getPageSource();
		
		if(Runtime_pageSource.contains("identifierId"))
		{
			WebElement Signin_UID=driver.findElement(By.id("identifierId"));
			Signin_UID.clear();
			Signin_UID.sendKeys("qadarshan@gmail.com");
		}
		else
		{
			System.out.println("Element not found at source");
		}
	

	}

}
