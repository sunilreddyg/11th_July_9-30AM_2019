package framework_testng.Example_Inheritance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestCases extends keywords
{
	
	
	@Test
	public void Tc001_signup_link()
	{
		Click_Element("//a[contains(.,'Sign Up')]");
		Assert.assertTrue(is_title_presented("Sign up for Facebook"));
		Reporter.log("Login link verified");
	}
	
	
	

  @BeforeMethod
  public void beforeMethod() 
  {
	  Load_Webpage("http://facebook.com");
  }

  @AfterMethod
  public void afterMethod(Method method) 
  {
	  Capturescreen(method.getName());
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Launch_browser("chrome");
	  set_timeout(20);
  }

  @AfterClass
  public void afterClass() 
  {
	  Close_browser();
  }

}
