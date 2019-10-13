package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass {
  
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Class-Precondition");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Class-postcondition");
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
