package user_interface_interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//IDentify frame at webpage and apply switch to it
		WebElement Demoframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Demoframe);
		
		
		//Identify locations under frame
		WebElement Src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Dst=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		/*
		 *  Enable mouse and keyboard interaction at Automation browser
		 */
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.pause(3000).dragAndDrop(Src, Dst).perform();
		
		

	}

}
