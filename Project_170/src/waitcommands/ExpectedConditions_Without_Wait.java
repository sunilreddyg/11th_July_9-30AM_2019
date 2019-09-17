package waitcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_Without_Wait {

	public static void main(String[] args) {
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
									    
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		
		//Verify title presented using expectedconditions class
		String Exp_title="Selenium - Web Browser Automation";
		if(ExpectedConditions.titleIs(Exp_title).apply(driver))
		{
			System.out.println("title presented");
		}
		else
		{
			System.out.println("Wrong title presented");
		}
		
		
	}

}
