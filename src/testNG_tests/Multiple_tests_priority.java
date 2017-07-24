package testNG_tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Multiple_tests_priority 
{

	@Test (priority = 1)
	public void testAA(){
	Assert.assertEquals("Gmail", "Gmail");
	}
	@Test (priority = 5)
	public void testBB(){
	Assert.assertEquals("Gmail", "Google");
	}
	@Test (priority = 10)
	public void testCC(){
	Assert.assertEquals("Yahoo", "Yahoo");
	}
	
	@Test (priority = 3,enabled = false)
	public void testA()
	{
	Assert.assertEquals("Gmail", "Gmail");
	}
	@Test (priority = 1)
	public void testB(){
	Assert.assertEquals("Google", "Google");
	}
	@Test (priority = 2)
	public void testC(){
	Assert.assertEquals("Yahoo", "Yahoo");
	}
}
