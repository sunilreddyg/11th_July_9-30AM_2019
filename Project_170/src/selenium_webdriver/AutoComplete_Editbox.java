package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.cleartrip.com");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);	
		
		//Type referral keyword at autocompleted editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000); //Static timeout to laod suggestions
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		//Type referral keyword at autocompleted editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(4000);//Static timeout to laod suggestions
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		//Select Active month date from data picker..
		Thread.sleep(3000);
		driver.findElement(By.linkText("15")).click();
		
		//Identify Departure date editbox and type date with in format.
		Thread.sleep(3000);
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.id("DepartDate")).sendKeys("Thu, 23 Jan, 2020");
		
		//Select Number of adults from dropdown
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("6");
		
		
		//Click link using partial name
		driver.findElement(By.partialLinkText("More options:")).click();
		Thread.sleep(4000);
		
		
		//Type referal keyword into autocomplete editbox
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("air india");
		Thread.sleep(4000); //Timeout to load suggestions
		driver.findElement(By.linkText("Air India (AI)")).click();
		
		//Submit button to search a flight
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
	}

}
