package browser_launch_commands;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browsers 
{

	public static void main(String[] args) 
	{
		
		/*
		 * download geckodriver.exe:-->
		 * 		URL:--> https://github.com/mozilla/geckodriver/releases
		 * 		select driver w.r.t browser version
		 * 				firefox browser version :-->  68
		 * 				geckodriver version     :-->  v0.24.0
		 * 		Download Zip format file w.r.t OS [WINDOWS]
		 * 		After download completed unzip file to backup folder
		 * 		
		 */
		
		//Store chromedriver path
		String path="D:\\sunill\\11th_July_9-30_2019\\Project_170\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://google.com");
		
		

	}

}
