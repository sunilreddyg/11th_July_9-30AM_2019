package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Commands {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.facebook.com");     //Load webpage
		driver.manage().window().maximize();  		//maximize browser window
					

		//Select dropdown option using visible text.
		new Select(driver.findElement(By.id("month")))
		.getOptions().get(5).click();
		
		//Get Dropdown Option Count
		int Option_count=new Select(driver.findElement(By.id("month")))
		.getOptions().size();
		
		System.out.println("Option Count is => "+Option_count);
		
		
		
		
		

	}

}
