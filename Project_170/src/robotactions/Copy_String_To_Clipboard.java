package robotactions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Copy_String_To_Clipboard {

	public static void main(String[] args) throws Exception 
	{
		

		//launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		String text="Selenium automates browsers. That's it! "
				+ "What you do with that power is entirely up to you.";
		
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Enable Runtime clipboard
		Clipboard Runtime_clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Content to clipboard
		Runtime_clipboard.setContents(Stext, Stext);
		
		//Create oject for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press S key
		robot.keyPress(KeyEvent.VK_S);
		
		
		//Copy system path
		String path="C:\\Users\\Administrator\\git\\11th_July_9-30AM_2019\\Project_170\\src\\robotactions\\Demo.txt";
		//Select path using String Selection
		StringSelection Spath=new StringSelection(path);
		//Set Content to runtime keyboard
		Runtime_clipboard.setContents(Spath, Spath);
		
		//peform Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		//Release downkey CONTROL
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
		
		
		
		
	}

}
