package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Visible_At_Webpage 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify gmail signin with invalid email address
		 * 
		 * 		Given url is  http://gmail.com
		 * 		when user Enter invalid email
		 * 		And click Next button to validate
		 * 		Then system response with appropriate error message.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://gmail.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
							
		
		//Identify email and press enter keyword
		WebElement Signin_Email_EB=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Signin_Email_EB.clear();
		Signin_Email_EB.sendKeys("darshan123eyui@gmail.com",Keys.ENTER);
		
		Thread.sleep(5000); //Static timeout to wait for result
		
		
		//Identify total webpage
		WebElement Page=driver.findElement(By.tagName("body"));
		//Get Completed visible at webpage
		String Page_Visible_text=Page.getText();
		
		//Verify Expected text available at webpage
		if(Page_Visible_text.contains("Couldn't find your Google Account"))
			System.out.println("TestPass:--> Expected error message displayed");
		else
			System.out.println("Testfail:--> Expected text not visible at webpage");
	}

}
