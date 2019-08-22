package corejava.Variables;

public class VariableTypes 
{
	String name="MQ";  //Instant variable
	static double price=1200.30;   //Class Variable
	
	public void method1()
	{
		int x=100; //Local variable
	}

	public static void main(String[] args)
	{
		//Create object for Instant variable access
		VariableTypes obj=new VariableTypes();
		String Iname=obj.name;
		System.out.println("Return value is => "+Iname);
		
		//Static Variable to call object creation is not neccessary
		Double Total=VariableTypes.price;
		System.out.println("Return price value is => "+Total);
	}

}
