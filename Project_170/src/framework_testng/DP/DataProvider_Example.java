package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider_Example 
{
  @Test(dataProvider = "dp",enabled=false)
  public void f(Integer n, String s) 
  {
	  System.out.println(n+"   "+s);
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
  
  
  @DataProvider
  public static String[][] user_info()
  {
	  String data[][]=
		  {
				  {"ajay","9030303030","tester"},
				  {"vikram","987461235","developer"},
				  {"akash","4712589631","tester"},
				  {"avinash","6787988979","tester"},
				  {"suresh","4654544541","manager"},
		  };
	  return data;
  }

  
  
  @Test(dataProvider="user_info")
  public void test_reg(String Name,String mobile,String role)
  {
	  System.out.println(Name+"   "+mobile+"   "+role);
  }
  
}
