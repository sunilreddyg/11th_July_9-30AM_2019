package user_interface_interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_on_Location {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.hdfcbank.com/");             //Load webpage
		driver.manage().window().maximize();              //maximize browser window
		
		
		/*
		 * Inorder to access mouse and keyboard interaction methods, we should
		 * create object for "Actions" Class.
		 */
		Actions action=new Actions(driver);
		
		WebElement Menu_Products=driver.findElement(By.xpath("//a[@href='/personal/products']"));
		WebElement Products_Cards=driver.findElement(By.xpath("//a[@href='/personal/products/cards']"));
		
		//perform mouse hover action on main category and sub-category
		action.moveToElement(Menu_Products)
		.pause(3000).moveToElement(Products_Cards).build().perform();
		
		//target Sub Category under Cards menu
		WebElement CreditCards=driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']"));
		action.click(CreditCards).perform();

		
	}

}
