package ui_ValidationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Element_Enable_OR_disableState 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
				

		/*
		 * Testcase:-->Verify locality editbox without city selection
		 * expected:--> Editbox should disable and display 
		 * 		text Please enter after city selection
		 * 	
		 */
		
		WebElement Locality_Editbox=driver.findElement(By.id("customLocality"));
		if(!Locality_Editbox.isEnabled()) //!--NOT
		{
			System.out.println("Testpass:--> As expected element is disabled");
		}
		else
		{
			System.out.println("Testfail:--> Locality editbox was enabled before state selection");
		}
		
		
		
		
		/*
		 * Testcase:-->Verify locality editbox After city selection
		 * expected:--> Editbox should enable and display
		 * 		text Please enter locality
		 */
		
		//Select State Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		
		//Timeout to load city options
		Thread.sleep(5000);
		
		//Select City Dropdown
		WebElement City_dropdown=driver.findElement(By.id("customCity"));
		new Select(City_dropdown).selectByVisibleText("Hyderabad");
		
		//Timeout before validate
		Thread.sleep(5000);
		
		
		if(Locality_Editbox.isEnabled())
			System.out.println("Testpass editbox enabled after state selection");
		else
			System.out.println("Testfail editbox disabled after state selection");
	}

}
