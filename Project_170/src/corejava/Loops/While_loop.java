package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class While_loop {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * While:-->  Is a condition based loop it accept iteration when condition
		 * 			  return true and stop iteration when condition return false.
		 * 	
		 * 		Note:--> While get into infinity loop incase condition was not
		 * 				 return false.
		 * 
		 * 			Syntax:-->
		 * 					while(condition)
		 * 					{
		 * 
		 * 					}
		 */
		
		
		/*
		 * Example:---> using while loop print numbers from 1 to 20
		 */
		int i=1;
		while(i<=20)
		{
			System.out.println(i);
			i=i+1;
			
		}
		
		/*
		 * Example:--> Using while loop manage timeout until required element
		 * 				 visible at webpage.
		 */
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	
		//Identify Retype email
		WebElement Retype_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		int j=0;
		//Accept iteration only when element not displayed at webpage
		while(!Retype_email.isDisplayed())
		{
			Thread.sleep(1000);
			if(j==30)
			{
				throw new Exception("Element is not visible at webpage,Timeout finished 30 seconds");
			}
			j=j+1;
		}
		
		
		System.out.println("Element visible at webpage");
		
		
		
		
		
	}

}
