package ui_Verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Page_Title {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://seleniumhq.org");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
				
		String Exp_title="Selenium - Web Browser Automation";
		
		//Capture runtime title
		String Act_title=driver.getTitle();
		
		//Verify equal comparision between two strings
		boolean flag=Act_title.equals(Exp_title);
		System.out.println("Title Comparision is => "+flag);
		
		//Decision to continue execution on expected title match
		if(flag==true)
		{
			System.out.println("Search completed");
		}
		else
		{
			System.out.println("Precondition failed expected title was not loaded..");
		}
		
		

	}

}
