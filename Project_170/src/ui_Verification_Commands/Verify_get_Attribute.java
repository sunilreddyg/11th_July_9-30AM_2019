package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_get_Attribute {

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
						
		
		//Locate Element
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		//Get Attribute of location
		String Runtime_Attribute=Nifty_tab.getAttribute("class");
		
		//Write a decision statement to accept condition on nifty tab selected
		if(Runtime_Attribute.contains("tab-active"))
			System.out.println("Testpass:--> As expected nifty tab was selected");
		else
			System.out.println("Testfail:--> Nifty tab was not selected");
		
		
		

	}

}
