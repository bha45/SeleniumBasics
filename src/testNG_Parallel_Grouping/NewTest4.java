package testNG_Parallel_Grouping;

import org.testng.annotations.Test;

public class NewTest4 
{
	@Test
	public void testCase1()
	{
	long id = Thread.currentThread().getId();
	System.out.println("Test Case 1 is Successful - Thread id is: "+ id);	  
	}
	
	@Test
	public void testCase2()
	{
	long id = Thread.currentThread().getId();
	System.out.println("Test Case 2 is Successful - Thread id is: "+ id);	  
	}
	
	@Test
	public void testCase3()
	{
	long id = Thread.currentThread().getId();
	System.out.println("Test Case 3 is Successful - Thread id is: "+ id);	  
	}
	
}
