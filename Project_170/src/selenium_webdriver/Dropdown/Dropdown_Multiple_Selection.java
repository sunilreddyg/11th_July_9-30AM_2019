package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_Selection 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Testcase:--> Verify State Dropdown multiple option selection
		 * Expected:--> State Drodpown should allow multiple option selection.
		 */
		
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
							
		
		
		boolean flag=new Select(driver.findElement(By.id("customState")))
				.isMultiple();
		
		System.out.println("Dropdown Multiple Selection State is => "+flag);
		
		//Decision to control single option and multiple type
		if(flag==true)
		{
			System.out.println("Multiple option type");	
		}
		else
		{
			System.out.println("Single option type");
		}
		

	}

}
