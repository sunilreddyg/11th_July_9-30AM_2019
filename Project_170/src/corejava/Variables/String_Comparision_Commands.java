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
		
		
		/*
		 * subString:-->
		 * 		  Method get sub String from main String.
		 */
		String Account_num="00001234565656";
		String AccountID=Account_num.substring(8);
		System.out.println("last 6 digit numbers => "+AccountID);
		
		String Account_Middle=Account_num.substring(4, 8);
		System.out.println("middle digits are => "+Account_Middle);
		
	
		/*
		 * length:--> 
		 * 		Method return characters count available at string.
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("mobile num available in digits => "+len);

		
		/*
		 * trim:--> 
		 * 		method trim extra spaces with in string [Left and right space]
		 */
		String Pincode="   500074    ";
		int Before_trim=Pincode.length();
		System.out.println("Before trim count is => "+Before_trim);
		
		int AfterTrim=Pincode.trim().length();
		System.out.println("After trim count is => "+AfterTrim);
		
	
		/*
		 * isEmpty:-->
		 * 			method verify string empty status and return 
		 * 			boolean value true/false
		 */
		String var="";
		String var1="Hello";
		
		System.out.println("Var empty status is => "+var.isEmpty());
		System.out.println("Var1 empty status is => "+var1.isEmpty());
		
		
		
		/*
		 * startswith:-->
		 * 		Method verify stored characters starts with
		 * 		expected sequence and return boolean value true/false
		 */
		String IFSC_Code="HDFC000012";
		boolean flag3=IFSC_Code.startsWith("HDFC");
		System.out.println("Starts with status is => "+flag3);
		
		
		/*
		 * toLowerCase:-->
		 * 		method convert any uppercase characters available
		 * 		at strign into lowercase characters.
		 */
		String toolname="WEBDRIVER";
		String New_tool_name=toolname.toLowerCase();
		System.out.println("toolname in lower case => "+New_tool_name);
		
	}

}
