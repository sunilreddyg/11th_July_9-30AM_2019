package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Size {

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
						
		//Locate Element
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		
		//Get Element size at runtime
		Dimension obj_dim=Nifty_tab.getSize();
		//Using object dimension get height and width of object
		int obj_height=obj_dim.getHeight();
		int obj_width=obj_dim.getWidth();
		
		System.out.println("object height is => "+obj_height);
		System.out.println("object width is => "+obj_width);
		
		
		//Verify element visibility at webpage using dimensions
		if(obj_height > 0)
			System.out.println("elemnet visible");
		else
			System.out.println("Element not visible");
		
		
		
		
		

	}

}
