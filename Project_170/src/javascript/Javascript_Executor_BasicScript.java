package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_BasicScript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.facebook.com/");       
		driver.manage().window().maximize();  
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//using javascript identify editbox and type text init
		js.executeScript("document.getElementById('u_0_m').value='Arjun'");
		
		//using javascript identify editbox and type text init
		js.executeScript("document.getElementById('u_0_o').value='Krishna'");
		
		//Using xpath identify location and type text into editbox with help of javascript
		WebElement Mobile_Editbox=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		js.executeScript("arguments[0].value='info.dsnr@gmail.com'", Mobile_Editbox);
		
		//Using xpath identify location and type text into editbox with help of javascript
		WebElement password_editbox=driver.findElement(By.xpath("//input[@aria-label='New password']"));
		js.executeScript("arguments[0].value='info.dsnr@gmail.com'", password_editbox);
				
		//Using javascript identify dropdown and select dropdown option
		js.executeScript("document.getElementById('day').value='15'");
		
		//Using javascript identify dropdown and select dropdown option
		js.executeScript("document.getElementById('month').value='11'");
		
		//Identify location using xpath
		WebElement Female_Radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		//Write javascript to select radio button
		js.executeScript("arguments[0].checked='true'", Female_Radio_btn);
				
		
		Thread.sleep(5000);  //static timeout
		//Identify location using xpath
		WebElement male_Radio_btn=driver.findElement(By.xpath("//input[@value='2']"));
		//Write javascript to select radio button
		js.executeScript("arguments[0].click()", male_Radio_btn);
						
				
	}

}
