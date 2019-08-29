package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->
		 * 			Verify search job without enter selection of course and keyword entry
		 * Steps:-->
		 * 		=> Given url https://www.firstnaukri.com/
		 * 		=> When click search button without enter Select courst and Keyword Enter
		 * 		=> Then receive Alert with expected text.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.firstnaukri.com/");       //Load webpage
		driver.manage().window().maximize();              //maximize browser window
		
		
		//Identify location
		WebElement Search_button=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_button.click();
		Thread.sleep(5000); //Static timeout
		
		
		
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		//Get text at popup
		String Alert_msg=alert.getText();
		System.out.println(Alert_msg);
		
		//Close alert window
		alert.accept();
		
	

		
		/*
		 * In selenium Alert exception:-->
		 * 	1. UnhandledAlertException:-->
		 * 			Exception present when alert was not handled at webpage
		 * 	2. NoAlertPresentedException:-->
		 * 			Exception present when expected alert not prompt at webpage.
		 */
		
				
		
		

	}

}
