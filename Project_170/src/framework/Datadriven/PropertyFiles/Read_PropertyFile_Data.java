package framework.Datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_PropertyFile_Data {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		String filepath="src/framework/Datadriven/PropertyFiles/Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		
		//Crate object for Property files
		Properties repository=new Properties();
		//Load inptu data to repository
		repository.load(fi);
		
		//Get Property values using property keyname.
		String Appurl=repository.getProperty("facebook.url");
		System.out.println("Application url is => "+Appurl);
		
		//Get location from property file
		String UID_locator=repository.getProperty("username_locator");
		System.out.println("Username Locator is => "+UID_locator);
		
		//get Input data form Property files
		String UID_Input=repository.getProperty("username");
		System.out.println(UID_Input);
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get(Appurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(UID_locator)).clear();
		driver.findElement(By.xpath(UID_locator)).sendKeys(UID_Input);
		
		
	}

}
