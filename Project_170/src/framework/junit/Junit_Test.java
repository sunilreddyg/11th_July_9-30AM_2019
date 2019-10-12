package framework.junit;

import org.junit.Test;

public class Junit_Test 
{
	@Test//Invoke method to run withou object creation
	public void test() 
	{
		System.out.println("tc001 executed");
	}
	
	@Test//Invoke method to run.
	public void test2() 
	{
		System.out.println("tc002 executed");
	}
	
	@Test//Invoke method to run
	public void test3() 
	{
		System.out.println("tc003 executed");
	}
	

}
