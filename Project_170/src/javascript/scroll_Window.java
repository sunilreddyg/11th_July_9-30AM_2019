package javascript;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class scroll_Window
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.facebook.com/");       
		driver.manage().window().maximize();  
		

		//To scroll window vertical.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(100,600)");
	   Thread.sleep(4000);
	   
	   //To Scroll horizonal.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");
	    
	}

}
