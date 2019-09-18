package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * example:--> Perform user-login with multiple set of table driven data.
		 */
	
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
					{"Newuser4","Newpwd4"},
					{"Newuser5","Newpwd5"},
			};
		
		
		//Iterate for array length
		for (int i = 0; i < userdata.length; i++) 
		{
			String UID=userdata[i][0];
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys(UID);
			
			String PWD=userdata[i][1];
			WebElement Password=driver.findElement(By.id("pass"));
			Password.clear();
			Password.sendKeys(PWD);
		
			Thread.sleep(2000);
			
		}
		

	}

}
