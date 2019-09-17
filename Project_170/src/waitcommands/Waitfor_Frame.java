package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_Frame 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
	
		//Enable Explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//click Signin button
		WebElement SignIn_btn=driver.findElement(By.xpath("//button[@class='login-btn'][contains(.,'Sign in')]"));
		//Move cursor to location..
		new Actions(driver).moveToElement(SignIn_btn).pause(3000).perform();
		SignIn_btn.click();
		
		//Identify frame locator
		By modalFrame=By.className("modalIframe");
		
		//Timeout to load expected frame load at webapge
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(modalFrame));
		System.out.println("Control available at modal frame");


		//Enter Mobile number
		WebElement mobileNum=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobileNum.clear();
		mobileNum.sendKeys("9030248855");
		
		
	}

}
