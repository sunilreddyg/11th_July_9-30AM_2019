package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_Option_At_Dropdown {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
			
		
		/*
		 * using javascript converting single option dropdown to 
		 * multiple selection..
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");

		
		

		boolean flag=new Select(driver.findElement(By.id("customState")))
				.isMultiple();
		
		
		//Decision to accept on multiple selection state
		if(flag==true)
		{
			Select State_dropdown=new Select(driver.findElement(By.id("customState")));
			State_dropdown.deselectAll(); //Only on multiple selection type
			State_dropdown.selectByIndex(2);
			State_dropdown.selectByIndex(4);
			State_dropdown.selectByIndex(6);
			
		}
		else
		{
			System.out.println("TestFail;-->Dropdown is a single option selection type");
		}
		
	}

}
