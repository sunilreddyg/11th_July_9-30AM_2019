package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_URL {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://seleniumhq.org");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
						
		
		String Exp_url="https://www.seleniumhq.org/";
		
		//Captur runtime url at webpage
		String Act_url=driver.getCurrentUrl();
		
		//Verify Application stats with https secured protocal
		if(Exp_url.startsWith("https://"))
		{
			System.out.println("Secured protocal");
			
			WebElement Downloads_tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
			Downloads_tab.click();
			
			//decision to verify url at webpage
			if(driver.getCurrentUrl().contains("download/"))
				System.out.println("Downloads page displayed");
			else
				System.out.println("download page not displayed");
			
		}
		else
		{
			System.out.println("Insecure protocal");
		}
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
