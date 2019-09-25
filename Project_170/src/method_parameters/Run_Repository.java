package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository 
{


	public static void main(String[] args) 
	{
		Repository obj=new Repository();
		obj.Launch_browser("chrome");
		obj.Load_Webpage("http://facebook.com");
		obj.set_timeout(30);
		
		obj.Enter_text("//input[@name='email']", "Darshan");
		obj.Enter_text("//input[@id='pass']", "User@1234");
	
		obj.Enter_text(By.cssSelector("#u_0_m"), "Akash");
		obj.Enter_text(By.name("lastname"), "krishna");
		
		
		//Select Dropdown
		obj.Select_Dropdown("//select[@aria-label='Day']", "23");
		obj.Select_Dropdown(By.id("month"), "Nov");
	
		
	}

}
