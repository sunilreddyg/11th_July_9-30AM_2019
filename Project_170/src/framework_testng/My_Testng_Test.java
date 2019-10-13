package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_Testng_Test 
{
  @Test//Invoke method to run without main method and object creation
  public void tc001() 
  {
	  Reporter.log("tc001 executed");
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("tc002 executed");
  }
  
  @Test
  public void tc003() 
  {
	  Reporter.log("tc003 executed");
  }
}
