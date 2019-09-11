package robotactions;


import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Action_Click {

	public static void main(String[] args) throws Exception 
	{
		//Handling browser notification popup window.
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Move cusor to location
		robot.mouseMove(305, 166);
		
		//Perform left click action
		robot.mousePress(InputEvent.BUTTON1_MASK);
		//Release Mouse
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

		//Vertical Scroll option
		robot.mouseWheel(500);

	}

}
