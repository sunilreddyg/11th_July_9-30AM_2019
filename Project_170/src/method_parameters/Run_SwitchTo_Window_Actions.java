package method_parameters;

import org.openqa.selenium.By;

public class Run_SwitchTo_Window_Actions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Create object for Repository
		Repository obj=new Repository();
		obj.Launch_browser("chrome");
		String url="https://www.hdfcbank.com/wholesale/default.htm";
		obj.Load_Webpage(url);
		obj.set_timeout(20);
		
		By Where_DD=By.xpath("//select[@name='where']");
		obj.Select_Dropdown(Where_DD, "ATM");
		Thread.sleep(5000);
		
		obj.switchto_window("ATMs in India.");
		Thread.sleep(3000);
		obj.Capturescreen("ATM window");
		
		obj.switchto_window("Wholesale Banking");
		Thread.sleep(2000);
		obj.Capturescreen("Homepage_from_ATM");

	}

}
