package method_return_types;

public class MethodTypes 
{

	public void method1()
	{
		//void is a method type it doesn't return any value
	}
	
	
	public String method2()
	{
		return "Mq-Dsnr";
	}
	
	
	public int method3()
	{
		return 100;
	}
	
	
	/*
	 * Note:-->
	 * 		=> Otherthan void for all method types we should
	 * 				write return keyword.
	 * 		=> Return value should match with method types
	 * 		=> At final the value return to method.
	 */
	
	
	public static void main(String args[])
	{
		 //Create object for class
		 MethodTypes obj=new MethodTypes();
		 obj.method1();
		 
		 //Method With return types
		 String var1=obj.method2();
		 System.out.println("String return value is => "+var1);
		 
		 int var2=obj.method3();
		 System.out.println("int return value is => "+var2);
	}

}
