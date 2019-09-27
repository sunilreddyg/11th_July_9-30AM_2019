package method_return_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable_Using_keywords 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.Launch_browser("chrome");
		String url="http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx";
		obj.Load_Webpage(url);
		obj.set_timeout(30);
		
		
		String Markets_Xpath="//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]";
		obj.Click_Element(Markets_Xpath);
		Thread.sleep(5000);
		
		
		WebElement Cell_Company=obj.Get_Static_Webtable_Cell("//div[@id='pnl_Bse']/table", 4, 0);
		String CompanyName=Cell_Company.getText();
		System.out.println(CompanyName);
		
		
		WebElement Cell_news=obj.Get_Dynaic_Webtable_Cell("//div[@id='pnl_Bse']/table", "HERHON", 7);
		Cell_news.findElement(By.tagName("a")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
