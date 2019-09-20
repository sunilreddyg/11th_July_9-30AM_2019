package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_GetOptions {

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://facebook.com");       
		driver.manage().window().maximize(); 
		
		
		//Identify Dropdown using Select Class
		Select Month_Dropdown=new Select(driver.findElement(By.id("month")));
		//Get list of Option Elemnet under dropdown
		List<WebElement> All_options=Month_Dropdown.getOptions();
		//Get Any single option from list
		All_options.get(6).click();
		Thread.sleep(5000);
		
		
		//Iterate number of objects
		for (int i = 0; i < All_options.size(); i++) 
		{
			//Get each object from list using index number
			String OptionName=All_options.get(i).getText();
			System.out.println(OptionName);
			
			//Click each Option
			All_options.get(i).click();
		}
		
		
		
		
		
		

	}

}
