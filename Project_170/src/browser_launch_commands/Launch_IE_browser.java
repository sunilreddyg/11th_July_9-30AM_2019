package browser_launch_commands;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_browser 
{

	public static void main(String[] args)
	{
		
		/*
		 * Downlaod IEDriverServer.exe:-->
		 * 
		 * 	Note:--> IEDriverServer developed by seleniumHQ team, In
		 * 			 this case  we need to follow IEDriverServer version
		 * 			 w.r.t WebDriver Selenium version..
		 * 
		 * 		=> URL:-->  https://www.seleniumhq.org/download/
		 * 		=> Under The Internet Explorer Driver Server download
		 * 			lasest driver [driver version should match with 
		 * 							selenium version]
		 * 
		 * 		=> Download Zip format file and unzip file to backup drive
		 * 		=> After unzip set runtime environment variable before initiate
		 * 					browser.
		 * 
		 * 
		 * 		Note:--> IE browser is a most secure browser, In this 
		 * 				 case we need to disable all security and privacty
		 * 				 settings..
		 * 
		 * 		Note:--> IE browser zoom level should be --> 100
		 */
		
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		//Browser initiation
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
	}

}
