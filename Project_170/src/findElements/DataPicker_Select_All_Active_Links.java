package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker_Select_All_Active_Links {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Click to open calendar 
		WebElement Open_Calendar=driver.findElement(By.className("cal_openLink"));
		Open_Calendar.click();
		Thread.sleep(2000);
		
		
		//Writing outter loop to iterate access next month dates
		for (int i = 0; i < 5; i++) 
		{
			
			//Identify Active month table
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			//Identify list of active links under table
			List<WebElement> Active_links;
			Active_links=Active_month.findElements(By.tagName("a"));
			
			//inner loop to Iterate for number of links
			for (int j = 0; j < Active_links.size(); j++) 
			{
				//Get Each Active link
				Active_links.get(j).click();
				//Thread.sleep(1000);
				
				//bring calendar to base state.
				Open_Calendar.click();
				
				
				//Restore all identification to avoid "staleElementreference" Exception
				Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_links=Active_month.findElements(By.tagName("a"));
			}
			
			
			
			if(i==3)
			{
				//Identify Active month table
				WebElement Next_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
				Next_month.findElements(By.tagName("a")).get(0).click();
				Thread.sleep(2000);
				
				//bring calendar to base state.
				Open_Calendar.click();
				Thread.sleep(1000);
			}
			
			
			if(i<3)
			{
			//Identify Next button
			WebElement Next_month_btn=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
			Next_month_btn.click();
			Thread.sleep(3000);
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
