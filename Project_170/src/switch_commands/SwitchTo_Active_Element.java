package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Active_Element {

	public static void main(String[] args) throws Exception
	{
	
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//IDentify Location
		WebElement Exp_Sal=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		Exp_Sal.click();
		Thread.sleep(3000);
		
		
		driver.switchTo().activeElement()
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);

		
		Thread.sleep(3000);
		driver.get("https://www.gmail.com");
		driver.switchTo().activeElement().sendKeys("qadarshan"+Keys.ENTER);
	}

}
