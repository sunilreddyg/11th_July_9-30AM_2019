package framework_testng.BeforeTest_and_AfterTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_For_Firefox
{
	
	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  @Test
	  public void login()
	  {
		  System.out.println("Login successfull");
	  }
	  
	  @BeforeSuite
	  public void Setup_browser()
	  {
		  System.out.println("suite pre-condition");
	  }
	  
	  
}
