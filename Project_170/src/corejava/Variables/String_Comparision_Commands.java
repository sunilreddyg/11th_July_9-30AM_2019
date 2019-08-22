package corejava.Variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:--> 
		 * 		=>String is a non-primitive datatype and also
		 * 		  called as Class.Because String contains set of
		 * 		  comparision methods to validate store characters
		 * 		  and behaviours.
		 * 
		 */
		
		String Exp_output="Messenger";
		String Act_output="messenger";
		
		/*
		 * Equals:-->
		 * 			Method verify equal comparision between two 
		 * 			Strings and return boolean value true/false.
		 * 		
		 * 			Note:--> Comparision is case sensetive
		 */
		boolean flag=Act_output.equals(Exp_output);
		System.out.println("Equal comparision is => "+flag);
		
		/*
		 * EquqlIgnorecase:-->
		 * 			Method verify equal comparision between two
		 * 			strings and return boolean value true/false
		 * 			by ignoring casesensitive
		 */
		boolean flag1=Act_output.equalsIgnoreCase(Exp_output);
		System.out.println("EqualIngorecase comparision is => "+flag1);
		
		
		/*
		 * Contains:-->
		 * 			method verify sub String available at main
		 * 			String and return boolean value true/false.
		 */
		String Status="Account 100 Created Successfull";
		boolean flag2=Status.contains("Created");
		System.out.println("Sub Strign Available Status is => "+flag2);
		
		
		
		
		
		

	}

}
