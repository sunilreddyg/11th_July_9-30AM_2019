package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Location 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
						
		
		//Locate Element
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		
		//Capture Element coordinates
		Point Obj_point=Nifty_tab.getLocation();
		int object_x=Obj_point.getX();
		int object_y=Obj_point.getY();
		
		System.out.println("object x coorindates are => "+object_x);
		System.out.println("object y coorindates are => "+object_y);
		
		
		//Verify Element visibility using object coordinates..
		if(object_x > 0)
		{
			System.out.println("Element visible at webpage");
		}
		else
		{
			System.out.println("Element not visible at webpage");
		}
		
		

	}

}
