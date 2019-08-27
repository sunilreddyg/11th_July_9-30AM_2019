package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CssValue {

	public static void main(String[] args) {
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
						
		
		//Locate Element
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		String BG_Color=Nifty_tab.getCssValue("background-color");
		String Font_Size=Nifty_tab.getCssValue("font-size");
		String Text_Alignment=Nifty_tab.getCssValue("text-align");
		
		
		System.out.println("background color in RGBA format => "+BG_Color);
		System.out.println("text size available  => "+Font_Size);
		System.out.println("text aligned at => "+Text_Alignment);
		
		

	}

}
