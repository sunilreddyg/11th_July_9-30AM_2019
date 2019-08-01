package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Drodpown_Multiple_Selection {

	public static void main(String[] args) 
	{
		/*
		 * Testcase:--> Verify dropdown accept maximum selection up to 3.
		 */
		
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
					
					
					//Find dropdown selection list
					int Count=State_dropdown.getAllSelectedOptions().size();
					if(Count==3)
					{
						System.out.println("Testpass, Selection meet expected count");
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
