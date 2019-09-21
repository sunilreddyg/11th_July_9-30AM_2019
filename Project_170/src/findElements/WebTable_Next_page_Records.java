package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Next_page_Records {

	public static void main(String[] args) {
		//Set Runtime environment variable for chrome driver
		String chrome_path="chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Identify Market link
		WebElement market_links=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		market_links.click();
		
		//Target NIfty link
		WebElement Nify_weightage_link=driver.findElement(By.xpath("//a[@title='Nifty Weightage']"));
		Nify_weightage_link.click();
		
		
		//identify Webtable
		WebElement table=driver.findElement(By.id("gridSource"));
		
		//Find list of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		int icount=0;
		//Iterate for Number of rows
		for (int i = 0; i < rows.size(); i++) 
		{
			//target Each dynamic row
			WebElement Dynamic_row=rows.get(i);
			String Rowtext=Dynamic_row.getText();
			System.out.println("=> "+Rowtext);
			
			
			if(icount==20)
			{
				WebElement Next_btn=driver.findElement(By.xpath("//th[@class='table-page:next']"));
				Next_btn.click();
				icount=0;
			}
			
			icount=icount+1;
		}
				


	}

}
