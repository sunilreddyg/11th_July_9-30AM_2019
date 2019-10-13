package framework_testng.Groups;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuite3 
{
	
	  @Test(groups="G1")
	  public void tc007() 
	  {
		  Assert.assertTrue(false);
		  Reporter.log("tc007  Executed",true);
	  }
	  
	  
	  @Test(groups="G2")
	  public void tc008()
	  {
		  Reporter.log("Tc008 executed",true);
	  }
	  
	  @Test(dependsOnGroups={"G1"},groups="G2")
	  public void tc009()
	  {
		  Reporter.log("Tc008 executed",true);
	  }
	  

}
