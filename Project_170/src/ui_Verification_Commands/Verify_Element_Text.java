package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Text {

	public static void main(String[] args)
	{
		/*
		 * Scenario:--> Verify flight search without enter proper details.
		 * 
		 * 		Given url is  http://cleartrip.com
		 * 		when user click search flights button
		 * 		Then system response with appropriate error message.
		 */
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
					
		WebElement Search_Flights=driver.findElement(By.xpath("//input[@title='Search flights']"));
		Search_Flights.click();
		
		//identify Error location
		WebElement Error_location=driver.findElement(By.id("homeErrorMessage"));
		//captur Element Text at runtime
		String  Runtime_text=Error_location.getText();
		System.out.println(Runtime_text);
		
		String Exp_text="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		
		
	}

}
