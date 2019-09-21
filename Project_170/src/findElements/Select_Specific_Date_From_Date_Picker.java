package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Specific_Date_From_Date_Picker {

	public static void main(String[] args) throws Exception
	{
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
		
		String Exp_Month="October 2019";
	    String Exp_Date="22";
		
		//Writing outter loop to iterate access next month dates
		for (int i = 0; i < 5; i++) 
		{
		
			//Identify Month Location
			WebElement Month_location=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table/thead/tr/th"));
			//Get Month name
			String MonthName=Month_location.getText();
			
			if(MonthName.equals(Exp_Month))
			{
				System.out.println("Found expected month");
				Thread.sleep(2000);
				driver.findElement(By.linkText(Exp_Date)).click();
				break;
			}
			
			if(i<3)
			{
			//Identify Next button
			WebElement Next_month_btn=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
			Next_month_btn.click();
			Thread.sleep(3000);
			}
			
			
			if(i==3)
			{
				//Identify Active month table
				WebElement Next_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
				Next_month.findElements(By.tagName("a")).get(0).click();
				Thread.sleep(2000);
				
				//bring calendar to base state.
				Open_Calendar.click();
				Thread.sleep(2000);
			}
				
				
		}//for-out
			
			
			

	}

}
