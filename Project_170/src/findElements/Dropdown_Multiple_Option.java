package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Multiple_Option 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> verify respective cities displayed on correspondent State
		 * 			    selection
		 */
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
	
		String Exp_Cities[]={"Please select state first",
				"South Andaman","65ggdfg","East Siang","Guwahati","Gaya"};
		
	
		//Identify State dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		//Identify list of options under selec tag
		List<WebElement> All_States=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for number of states
		for (int i = 0; i < 6; i++) 
		{
			//IDentify Each State using dynamic Index numeber
			WebElement EachState=All_States.get(i);
			//Get State name
			String StateName=EachState.getText();
			//Click Each state
			EachState.click();
			Thread.sleep(3000);
			
			
			//Get All City Dropdown option
			WebElement City_Dropdown=driver.findElement(By.name("cityName"));
			//Capture All Option under city dropdown
			String All_Cities=City_Dropdown.getText();
			
			if(All_Cities.contains(Exp_Cities[i]))
			{
				System.out.println(StateName+"==>   "+Exp_Cities[i]+" ==> Option found");
			}
			else
			{
				System.out.println(StateName+"==>   "+Exp_Cities[i]+" ==> Option not found");	
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
