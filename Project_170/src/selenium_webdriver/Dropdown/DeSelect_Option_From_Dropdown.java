package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect_Option_From_Dropdown 
{

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

		
		
		//Method verify Dropdown selection type single/multiple
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
			
			
			//Find dropdown selection list
			int Count=State_dropdown.getAllSelectedOptions().size();
			
			if(Count==3)
			{
				System.out.println("Testpass, Selection meet expected count");
				
						//Deselect single option
						State_dropdown.deselectByIndex(4);
						
						//Get All Selected Options
						int Dcount=State_dropdown.getAllSelectedOptions().size();
						if(Dcount==2)
						{
							System.out.println("TestPass:--> User able to modify selection");
						}
						else
						{
							System.out.println("TestFail:--> Count mismatch fail to modify search");
						}
			}
			else
			{
				System.out.println("Testfail, didn't meet expected count");
			}
			
			
			
		}
		else
		{
			System.out.println("TestFail;-->Dropdown is a single option selection type");
		}
		

	}

}
