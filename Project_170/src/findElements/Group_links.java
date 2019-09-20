package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify Footer link area
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
		//Identify number of link at footer area
		List<WebElement> All_footer_links;
		All_footer_links=Footer_Area.findElements(By.tagName("a"));
		
		//get size of footer links
		int Links_count=All_footer_links.size();
		System.out.println("Number of footer links available is => "+Links_count);
		
		//Iterate for number of links
		for (int i = 0; i < Links_count; i++) 
		{
			
			//Get each link from list
			WebElement Each_link=All_footer_links.get(i);
			//get linkname and href
			String Linkname=Each_link.getText();
			String Linkhref=Each_link.getAttribute("href");
			
			System.out.println(Linkname+"      "+Linkhref);
			
			
			//Click Each link
			Each_link.click();
			Thread.sleep(3000);
			
			//Navigate back
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore all identifications to avoid <"StaleElementReference Exception">
			Footer_Area=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
			All_footer_links=Footer_Area.findElements(By.tagName("a"));
		}
		
	}

}
