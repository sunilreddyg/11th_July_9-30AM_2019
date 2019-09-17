package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_For_Input_Presented_At_Editbox 
{

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://gmail.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		//Type email and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan");
		
		
		//mange Explicit wait
		//Enable Explicit wait at automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.textToBePresentInElementValue
				(By.id("identifierId"), "qadarshan"));
		System.out.println("Timeout released expected input available at editbox");
		
		
		
		
		
		
		
		

	}

}
