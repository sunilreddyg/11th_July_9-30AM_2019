package framework_testng.DP;

import org.testng.annotations.Test;

public class DataProvier_From_Diff_Class 
{
	/*
	 * Inorder to use dataprovider data in diff class, we must define class name
	 * of data provider class.
	 * 
	 * 		@Test(dataprovider="methodname",dataproviderClass=Classname.class)
	 */
	
	@Test(dataProvider="user_info",dataProviderClass=DataProvider_Example.class)
	public void get_user_info(String name,String mobile,String role)
	{
		
	}



}
