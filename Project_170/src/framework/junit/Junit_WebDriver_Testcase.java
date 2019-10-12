package framework.junit;

import static org.junit.Assert.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_WebDriver_Testcase 
{
	static WebDriver driver;
	static String chrome_path="chrome_driver\\chromedriver.exe";
	//Annoation helps to retrieve current constructed method name.
	public @Rule TestName test=new TestName();  
	
	@Test
	public void Tc001_Signup_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup page title verified");
	}
	
	
	@Test
	public void Tc002_Login_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("Login page title verified");
	}
	
	
	
	@Test
	public void Tc003_Messenger_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger page title verified");
	}
	
	

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		
		Date d=new Date();   //import java.util;
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/EEE/dd/");
		//Using simple date format convert system default date
		String time=df.format(d);
				
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//dump file into local utilities
		FileUtils.copyFile(src, new File("screens\\"+time+test.getMethodName()+".png"));
				
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", chrome_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	

}
