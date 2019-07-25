package corejava.otherpackage;

import corejava.StaticMethods.NativeInputs;
import corejava.defaultmethods.Robot;

public class Run_Methods_From_diff_package {

	public static void main(String[] args) 
	{
		
		//Run Default methods from diff package
		Robot ref=new Robot();
		ref.walk();
		ref.run();
		
	
		//Run Static methods from diff package
		NativeInputs.Keyboard();
		NativeInputs.Mouse();
		

	}

}
