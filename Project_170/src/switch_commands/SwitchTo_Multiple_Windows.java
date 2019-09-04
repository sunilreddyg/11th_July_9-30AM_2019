package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchTo_Multiple_Windows
{

	public static void main(String[] args) throws InterruptedException
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		

		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All Dynamic window ID's 
		Set<String> All_Window_IDS=driver.getWindowHandles();
		//Apply foreach loop to iterate for number of dynamic windows
		for (String EachWindow_ID : All_Window_IDS) 
		{
			driver.switchTo().window(EachWindow_ID);
			//Get Runtime title of each window
			String Runtime_title=driver.getTitle();
			
			//Accept condition on expected title match
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break; //Stop iteration on Expected Title match
			}
		}
		
		
		//Get Window Runtime title
		System.out.println("Current Focused window title is => "+driver.getTitle());

	}

}
