package robotactions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Download_Using_RobotClass 
{

	public static void main(String[] args) throws Exception 
	{
		
		//set runtime environment variable
		String driver_path="Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driver_path);
					
		//browser initiation command
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		
		//Identify selenium latest version link
		WebElement Latest_Version=driver.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']"));
		Latest_Version.click();
		Thread.sleep(3000);
		
		
		//Crate object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);

		
		//Peform Shift+TAB
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release shift key
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
		
		
		
		
		
		

	}

}
