package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_Until_Title_Presented 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		//Load webpage to browser window
		driver.get("http://seleniumhq.org");
		//Maximize browser window
		driver.manage().window().maximize();
		
		
		//Enable Explicit wait timeout on runtime automation browser.
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleIs("Selenium - Web Browser Automation"));
		System.out.println("SeleniumHQ homepage title verified");
		
		
		//identify Downlaods link
		WebElement Downloads=driver.findElement(By.linkText("Download"));
		Downloads.click();
		
		
		wait.until(ExpectedConditions.titleContains("Downloads"));
		System.out.println("Downloads page title verified");
		
		
		
		
		

		
		

	}

}
