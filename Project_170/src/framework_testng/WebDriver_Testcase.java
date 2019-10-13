package framework_testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_Testcase 
{
  WebDriver driver;
  String chrome_path="chrome_driver\\chromedriver.exe";
  
 
	@Test
	public void Tc001_Signup_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		Reporter.log("Signup link verified");
	}
	
	
	@Test
	public void Tc002_Login_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		Reporter.log("Login link verified");
	}
	
	
	
	@Test
	public void Tc003_Messenger_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		Reporter.log("messenger link verified");
	}
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get("http://facebook.com");
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  Date d=new Date();   //import java.util;
	  SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/EEE/dd/");
	  String time=df.format(d);
				
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("screens\\"+time+method.getName()+".png"));
	  //method.getName() ==>Return Current consturcted test name
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", chrome_path);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
