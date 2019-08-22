package corejava.Variables;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		/*
		 * byte:--> Integer datatype [Only store numbers]
		 * 			Range is min -128  to max 127
		 */
		byte a=127;
		System.out.println(a);
		
		/*
		 * int:--> Integer datatype [Only store numbers]	
		 * 		   Default value is 0.
		 * 		   Range;--> -2,147,483,648 to 2,147,483, 647
		 */
		int b=123456;
		int c=123456;
		int d=b+c;
		System.out.println("Total value is => "+d);
		
		
		/*
		 * boolean:--> Only Store [true/false]
		 * 			   Default value is false.
		 */
		 boolean flag=true;
		 System.out.println("TestStatus is => "+flag);
		
		
		/*
		 * double:--> Double store decimal values.
		 * 				±1.79769313486231570E+308    
		 * 				(15 significant decimal digits)
		 */
		double price=1200.22;
		System.out.println("Price value is => "+price);
		
		
		/*
		 * String:--> Store set of characters
		 * 			  Default value is null.
		 * 			  
		 */
		String name="Mq-dsnr";
		String email="info.dsnr@gmail.com";
		String mobile="9030248855";
		
		System.out.println(name+"   "+email+"   "+mobile);
		
		
		
	}

}
