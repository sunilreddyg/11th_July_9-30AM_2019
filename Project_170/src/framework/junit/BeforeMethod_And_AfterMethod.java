package framework.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod {

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Method Precondition");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("Method Postcondition"+"\n");
	}

	@Test
	public void test() 
	{
		System.out.println("Tc001 Executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Tc002 Executed");
	}
	

	@Test
	public void test3() 
	{
		System.out.println("Tc003 Executed");
	}
}
