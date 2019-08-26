package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Any_Record_Available_At_Webtable {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
							

		//Identify table
		WebElement Webtable=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		//Capture Visible text at webpage
		String Top_Gainers_list=Webtable.getText();
		
		//Verify Expected records available at topgainers list
		if(Top_Gainers_list.contains("YESBAN"))
			System.out.println("Testpass:-->Expected record found at gainers table");
		else
			System.out.println("TestFail:-->Expected record not found at gainers table");
	}

}
