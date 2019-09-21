package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Read_Data_From_SpecificRow_And_Cell 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Example:--> Read 2nd row, 3rd cell data from Webtable
		 */
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify markets link
		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
	
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='dvToplooser']/table"));
		//Find list of rows available with in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//target 2nd row
		WebElement Selected_Row=rows.get(2);
		
		//Find list of cells under selected table
		List<WebElement> Cells=Selected_Row.findElements(By.tagName("td"));
		
		//Target 3rd cell
		String Company_name=Cells.get(0).getText();
		String HighPrice=Cells.get(3).getText();
		
		System.out.println(Company_name+"   "+HighPrice);
		
		

	}

}
