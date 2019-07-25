package browser_launch_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chorme_Browser
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver:-->
		 * 
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 		Click <<Google Chrome driver>> link under thirparty browsers.
		 * 		Select chomedriver version w.r.t chrome browser version
		 * 					Url:--> https://sites.google.com/a/chromium.org/chromedriver/downloads
		 * 					chromebrowser :-->  75
		 * 					chromeDriver  :-->  75.0.3770.140
		 * 		Select Operating system and download zip format file.
		 * 		After download finish unzip file to backup folder..
		 * 
		 */
		
		//Store chromedriver path
		String path="D:\\sunill\\11th_July_9-30_2019\\Project_170\\Drivers\\chromedriver.exe";
		//Setup runtime environment variable with chromedriver
		System.setProperty("webdriver.chrome.driver", path);
		 
		//Launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		//Load webpage to browser window
		chrome.get("http://google.com");
	
		
		
	}

}
