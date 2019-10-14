package framework_testng.Suite_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Get_Parameters_From_Suite 
{
	public WebDriver driver;
	
	@Test(priority=0)
	@Parameters("browser_name")
	public void launch_browser(String bname)
	{
		switch (bname) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver","chrome_driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			//Set Runtime environment variable for chrome driver
			String chrome_path="chrome_driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chrome_path);
			driver=new ChromeDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver","chrome_driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
				
		default:System.out.println("browser mismatch");
			break;
		}
	}
	
	@Test(priority=1)
	@Parameters("appurl")
	public void loadWebpage(String url)
	{
		driver.get(url);
		Reporter.log("Webpage load successfull");
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid,String Apwd)
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(Auid);
		Reporter.log("Email enter successfull");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(Apwd);
	}
	
	
	@Test(priority=3)
	@Parameters("Fname")
	public void User_registration(String firstname)
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	}
	
	
	
	

}
