package method_parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Repository 
{

	public WebDriver driver;
	public String driver_path="chrome_driver\\";
	
	/*
	 * Keyword:--> Launch Browser [Firefox,Chrome,IE]
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Launch_browser(String browser_name)
	{
		switch (browser_name) 
		{
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("browser mismatch");
			break;
		}
		
	}
	
	

	/*
	 * Keyword:--> Load webpage
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Load_Webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	

}
