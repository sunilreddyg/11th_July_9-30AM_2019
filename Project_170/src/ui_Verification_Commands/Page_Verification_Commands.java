package ui_Verification_Commands;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands 
{

	public static void main(String[] args) throws Exception
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://seleniumhq.org");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
				
			
		//Captur Runtime page title
		String Runtime_title=driver.getTitle();
		System.out.println("Page title is => "+Runtime_title);
		
		//Capture Runtime url of webpage
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Page url is => "+Runtime_url);
		
		//Capture PageSource 
		String Runtime_page_source=driver.getPageSource();
		System.out.println(Runtime_page_source);
		
		//Capture current window Dynamic ID
		String Window_Dynamic_ID=driver.getWindowHandle();
		System.out.println("Window ID is => "+Window_Dynamic_ID);
		
		//Capture All Dynamic window ID's
		Set<String> All_window_Dynamic_IDS=driver.getWindowHandles();
		
		
		Thread.sleep(2000);
		driver.close(); //Close browser window

	}

}
