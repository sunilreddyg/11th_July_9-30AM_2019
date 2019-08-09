package webdriver_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_CSS
{

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		
		//click link using href property
		WebElement Create_Account_link=driver.findElement(By.cssSelector("a[href='//register.rediff.com/register/register.php?FormName=user_details']"));
		Create_Account_link.click();
		
		
		/*
		 * 
		 */
		WebElement Name_Editbox=driver.findElement(By.cssSelector("input[name*='name']"));
		Name_Editbox.clear();
		Name_Editbox.sendKeys("MQDSNR");
		
		
		WebElement Email_Editbox=driver.findElement(By.cssSelector("input[name^='login']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("info.dsnr");
		
		WebElement Email_Check_Btn=driver.findElement(By.className("btn_checkavail"));
		Email_Check_Btn.click();
		

	}

}
