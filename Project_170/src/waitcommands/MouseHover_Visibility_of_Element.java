package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover_Visibility_of_Element 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser by creation of object for Actions Class.
		 */
		Actions action=new Actions(driver);
		//Create object for explicitwait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		//Identify main category element
		By Main_Category=By.xpath("//span[contains(.,'Departments')]");
		//Perform hover action on location
		action.moveToElement(driver.findElement(Main_Category)).perform();
		
		//Wait until element visible at webpage
		By sub_Category_books=By.xpath("//span[@class='nav-text'][contains(.,'Books')]");
	    wait.until(ExpectedConditions.visibilityOfElementLocated
	    		(sub_Category_books)).click();

	}

}
