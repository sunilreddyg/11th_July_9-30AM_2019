package pageobjects.Without_pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import method_parameters.Repository;

public class FB_SignIn
{
	  WebDriver driver;
	  
	  public FB_SignIn(WebDriver driver) 
	  {
		this.driver=driver;
	  }
	
	  //Locators at webpage
	  By Email=By.xpath("//input[@name='email']");
	  By Password=By.xpath("//input[@name='pass']");
	  By Login_btn=By.xpath("//input[contains(@value,'Log In')]");
	  static By Forgotten_Link=By.xpath("//a[contains(.,'Forgotten account?')]");
	
	  /*
	   * Methodname:--> User Login
	   */
	  public void User_login(String UID,String PWD)
	  {
		 driver.findElement(Email).clear();
		 driver.findElement(Email).sendKeys(UID);
		 
		 driver.findElement(Password).clear();
		 driver.findElement(Password).sendKeys(PWD);
		 
		 driver.findElement(Login_btn).click();
		 
	  }
	  
	
	
}
