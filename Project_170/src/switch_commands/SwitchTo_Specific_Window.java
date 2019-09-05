package switch_commands;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Specific_Window 
{

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		//Get Mainwindow Dynamic ID
		String MainWindow=driver.getWindowHandle();
	
		//Get All dynamic window ID's
		Set<String> All_Window_IDS=driver.getWindowHandles();
		
		//Iterate for number of windows using foreach loop
		for (String Eachwindow : All_Window_IDS) 
		{
			//Accept condition only at sub windows
			if(!Eachwindow.equals(MainWindow))
			{
				driver.switchTo().window(Eachwindow);
				driver.close();
			}
		}
		
		
		driver.switchTo().window(MainWindow);
		System.out.println("Current Foucused window title is => "+driver.getTitle());

	}

}
