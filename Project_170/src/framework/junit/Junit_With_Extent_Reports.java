package framework.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Junit_With_Extent_Reports {

	static ExtentReports reporter;
	static String htmlpath="C:\\Users\\Administrator\\git\\11th_July_9-30AM_2019\\Project_170\\src\\framework\\junit\\MyReports.html";
	ExtentTest test;
	public @Rule TestName testname=new TestName();
	
	
	
	@Test
	public void Tc001_Signup_link()
	{
		test.log(LogStatus.PASS, "Signup page title verified");
	}
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		reporter=new ExtentReports(htmlpath);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		reporter.flush();
	}

	@Before
	public void setUp() throws Exception 
	{
		test=reporter.startTest(testname.getMethodName());
		
	}

	@After
	public void tearDown() throws Exception 
	{
		reporter.endTest(test);
	}



}
