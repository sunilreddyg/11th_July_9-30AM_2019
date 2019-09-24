package method_parameters;


public class Local_Parameters 
{
	
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	//Method with single parameter
	public void print_tool(String tool_name)
	{
		String name=tool_name;
		System.out.println(name);
	}
	
	//Method with multiple parameters
	public void print_tool(String tool_name,double price)
	{
		String name=tool_name;
		 double tool_price=price;
		System.out.println(name+"    "+tool_price);
	}
	
	

	public static void main(String[] args) 
	{
		//Create object for class
		Local_Parameters obj=new Local_Parameters();
		obj.print_tool();
		obj.print_tool();
		
		
		//Calling method with single argument
		obj.print_tool("Appium");
		obj.print_tool("cucumber");
		
		//calling method with multiple arguments
		obj.print_tool("Appium", 5000.00);
	}

}
