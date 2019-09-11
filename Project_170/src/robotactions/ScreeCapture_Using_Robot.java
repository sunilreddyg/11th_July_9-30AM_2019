package robotactions;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeCapture_Using_Robot {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method st//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.firstnaukri.com/");       //Load webpage
		driver.manage().window().maximize();              //maximize browser window
		
		
		//Identify location
		WebElement Search_button=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_button.click();
		Thread.sleep(5000); //Static timeout
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(5000);
		
		//Get Scree dimension
		Dimension Screen_Size=Toolkit.getDefaultToolkit().getScreenSize();
		//Capture screen with robot
		BufferedImage Image=robot.createScreenCapture(new Rectangle(Screen_Size));
		//Target location
		String filepath="C:\\Users\\Administrator\\git\\11th_July_9-30AM_2019\\Project_170\\src\\robotactions\\scree1.png";
		//write image into local system
		ImageIO.write(Image, "PNG", new File(filepath));
		
	
		
		/*
		 * Note:--> Selenium can't take screen shot
		 * 			while alert presented at webpage.
		 * 		
		 * 			Using Robot [AWT] framework we can
		 * 			take screen when alert presented at webpage		
		 * 
		 */
		
	}

	

}
