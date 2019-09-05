package navigation_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To_Webpage {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.facebook.com");           //Load webpage
		driver.manage().window().maximize(); 
		
		//Open webpage without click on link..
		driver.navigate().to("https://messenger.com/");

	}

}
