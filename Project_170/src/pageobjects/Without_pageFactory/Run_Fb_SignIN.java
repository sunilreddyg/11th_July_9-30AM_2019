package pageobjects.Without_pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Fb_SignIN {

	public static void main(String[] args)
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Inorder to access any class instant method/variable we should create object.
		FB_SignIn obj=new FB_SignIn(driver);
		obj.User_login("9030248855", "Hello12345");
		
		
		
		
		
		
	}

}
