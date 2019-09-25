package pageobjects.With_Resuable_Keywords;

import method_parameters.Repository;

public class Run_using_Keywords {


	public static void main(String[] args)
	{
		
		Repository obj=new Repository();
		obj.Launch_browser("chrome");
		obj.Load_Webpage("http://facebook.com");
		obj.set_timeout(30);

		FB_Registration fb=new FB_Registration(obj.driver);
		
		//Fill Signin form
		obj.Enter_text(fb.Firstname, "Newuser");
		obj.Enter_text(fb.Surname, "Webdriver");
		obj.Enter_text(fb.Email_or_Mobile, "Newuserwebdriver@gmail.com");
		obj.Enter_text(fb.Retype_mobile, "Newuserwebdriver@gmail.com");
		obj.Enter_text(fb.Password, "Newuser");
		
		obj.Select_Dropdown(fb.DOB_Day, "24");
		obj.Select_Dropdown(fb.DOB_Month, "Nov");
		obj.Select_Dropdown(fb.DOB_year, "1990");

	}

}
