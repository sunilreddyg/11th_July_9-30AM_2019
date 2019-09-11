package robotactions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploading_Using_RobotClass 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		//Identify UploadCV button
		WebElement Upload_CV_Btn=driver.findElement(By.xpath("//input[contains(@id,'input_resumeParser')]"));
		Upload_CV_Btn.click();
		
		
		
		String text="C:\\Users\\Administrator\\Downloads\\Sunil.docx";
		
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Get default system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipboard at runtime.
		clipboard.setContents(Stext, Stext);
		
		
		//Crate object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
				
		//Press Ctrl+V to paste copied text into notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
				
		//Press enter key
		robot.keyPress(KeyEvent.VK_ENTER);
				
		//Release Control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
				
		
		
		
		

	}

}
