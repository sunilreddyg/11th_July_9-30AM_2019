package method_return_types;

public class Run_Repository_Method_types {

	public static void main(String[] args) 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.Launch_browser("chrome");
		obj.Load_Webpage("http://facebook.com");
		obj.set_timeout(30);
		
		//Verifying title presented at webpage using Reusable method
		if(obj.is_title_presented("Facebook"))
			System.out.println("Facebook title verified");
		else
			System.out.println("Facebook title mismatch");
		
		//verifying url presented at webpage using reusable method
		if(obj.isUrl_Presented("https://www.facebook.com/"))
			System.out.println("facebook url presented");
		else
			System.out.println("Facebook url mismatch");
		
		//verifying text visible at webpage using reusable method
		if(obj.isText_visibleAt_Webpage("It's quick and easy."))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
		//Verifying alert presented at webpage
		if(obj.isAlert_presented())
			System.out.println("Alert presented at webpage");
		else
			System.out.println("Alert not presented at webpage");
		
		//Close alert window
		obj.CloseAlert();
		
	
	}

}
