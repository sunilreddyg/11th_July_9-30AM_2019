package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Private_Window {

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.facebook.com/");          //Load webpage
		driver.manage().window().maximize();    		  //maximize browser window
						
		//Syntax retrieve dynamic id of current window.
		String MainwindowID=driver.getWindowHandle();
		
		//Identify link
		WebElement Instagram_hyper_link=driver.findElement(By.linkText("Instagram"));
		Instagram_hyper_link.click();  //Link open private page at private window
		
		//Get all window dynamic ID's 
		Set<String> All_windowIDS=driver.getWindowHandles();
		//Apply foreach to iterate number of dynamic windows
		for (String EachWIndowID : All_windowIDS) 
		{
			//Accept only when main window not equals to runtime dynamic id
			if(!MainwindowID.equals(EachWIndowID)) //!--NOT
			{
				driver.switchTo().window(EachWIndowID);
				break;
			}
		}
	
		Thread.sleep(2000);
		System.out.println("Current focused window title is => "+driver.getTitle());
		
		
		//Identify Email Editbox at Private window
		WebElement Email_OR_Mobile=driver.findElement(By.name("emailOrPhone"));
		Email_OR_Mobile.clear();
		Email_OR_Mobile.sendKeys("9030248855");
		
		//Close browser window
		driver.close();
		
		//Get Controls to mainwindow
		driver.switchTo().window(MainwindowID);
		System.out.println("Current Focussed window title is =>"+driver.getTitle());

	}

}
