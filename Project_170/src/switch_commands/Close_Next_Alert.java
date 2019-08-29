package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Next_Alert {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.firstnaukri.com/");       //Load webpage
		driver.manage().window().maximize();              //maximize browser window
		
		
		//Identify location
		WebElement Search_button=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_button.click();
		Thread.sleep(5000); //Static timeout
		
		
		
		
		//handle next alert presented
		 boolean acceptNextAlert = true;
		  try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		    } finally {
		      acceptNextAlert = true;
		    }

	}

}
