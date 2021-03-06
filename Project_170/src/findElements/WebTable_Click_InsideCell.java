package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Click_InsideCell 
{

	public static void main(String[] args) {
		

		//Set Runtime environment variable for chrome driver
		String chrome_path="chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify markets link
		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
	
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		//Find list of rows available with in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for (int i = 1; i < rows.size(); i++) 
		{
			//target 2nd row
			WebElement DynamicRow=rows.get(i);
			
			//Get Dynamic row text
			String Row_text=DynamicRow.getText();
			
			if(Row_text.contains("HDFBAN"))
			{
				//Find list of cells under selected table
				List<WebElement> Cells=DynamicRow.findElements(By.tagName("td"));
				//Identify seventh cell
				Cells.get(7).findElement(By.tagName("a")).click();
				break;
				
			}
			
			
			
		}

	}

}
