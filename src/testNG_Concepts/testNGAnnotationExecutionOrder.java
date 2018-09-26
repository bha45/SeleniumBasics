package testNG_Concepts;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotationExecutionOrder {
	
	@BeforeSuite
	public static void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public static void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeTest
	public static void beforeTest()
	{
		System.out.println("Before Test");
	}

	@AfterTest
	public static void afterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeGroups
	public static void beforeGroup()
	{
		System.out.println("Before Group");
	}
	
	@AfterGroups
	public static void afterGroup()
	{
		System.out.println("After Group");
	}
	
	@BeforeMethod
	public static void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public static void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@Test
	public static void testMethod()
	{
		System.out.println("Test Method");
	}
}
