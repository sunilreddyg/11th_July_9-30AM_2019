package user_interface_interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu_On_Element {

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-jQuery-Right-Click-Context-Menu-Plugin/demo/");
		driver.manage().window().maximize();
		
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser.
		 */
		Actions action=new Actions(driver);
	
		
		//Identify webElement
		WebElement Element1=driver.findElement(By.xpath("//body/div[2]/span[1]"));
		//Right click on Element1
		action.contextClick(Element1).perform();
		Thread.sleep(4000);
		
		
		//Identify Location
		WebElement More_options=driver.findElement(By.xpath("//a[contains(.,'More')]"));
		//Perform hover on selected element
		action.moveToElement(More_options).perform();
		Thread.sleep(4000);
		
		//Click Sub1 Options
		driver.findElement(By.xpath("//a[contains(.,'Sub 1')]")).click();
		Thread.sleep(4000);
			
		//Close Alert popup
		driver.switchTo().alert().accept();
	}

}
