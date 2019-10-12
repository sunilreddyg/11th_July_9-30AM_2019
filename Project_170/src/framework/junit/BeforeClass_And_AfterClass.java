package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("BeforeClass-Precondition Executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("AfterClass-PostCondition Executed");
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

}
