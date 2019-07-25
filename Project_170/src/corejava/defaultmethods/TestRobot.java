package corejava.defaultmethods;

public class TestRobot 
{

	public static void main(String[] args) 
	{
		 new Robot().run();
		 new Robot().walk();
		 
		 
		 //Call Any public class methods using object referral
		 Robot obj=new Robot();
		 obj.run();
		 obj.walk();
		 
		 
		 /*
		  *	Note:--> Inorder to call any public class
		  *			default methods we should create
		  *			object for class.
		  *
		  *Syntax:-->
		  *			ClassName obj=new ClassName();
		  *			obj.Methodname();
		  */
		 
	

	}

}
