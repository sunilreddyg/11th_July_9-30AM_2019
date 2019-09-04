package switch_commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Iterators 
{

	public static void main(String[] args) throws Exception 
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
		
		//Get All Window Dynamic IDs
		Set<String> AllWindow_IDS=driver.getWindowHandles();
		//Get Al collection of window id's to iterators
		Iterator<String> itr=AllWindow_IDS.iterator();
		
		//Each iterator we can access by next keyword
		String MainWindow=itr.next();
	
		
		String W2=itr.next();
		driver.switchTo().window(W2);
		System.out.println("W2 title is => "+driver.getTitle());
		
	}

}
