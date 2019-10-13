package framework_testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeMethod_And_AfterMethod {
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("method-precondition");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("method-postcondition"+"\n");
  }
  
  @Test
  public void tc001() 
  {
	  Reporter.log("tc001 executed",true);
  }
  
  
  @Test
  public void tc002() 
  {
	  Reporter.log("tc002 executed",true);
  }
 

}
