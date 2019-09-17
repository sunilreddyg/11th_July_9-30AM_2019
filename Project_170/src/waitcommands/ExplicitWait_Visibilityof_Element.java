package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Visibilityof_Element 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//Create object for webdriverait and assign timeout to automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		//Type Email and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan");

		
		
		WebElement Password_Editbox=wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.name("password")));
		
		Password_Editbox.clear();
		Password_Editbox.sendKeys("Hello");
		
		
		
		
	}

}
