package testNG_Parallel_Grouping;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Mutliple_Tests 
{
	@Test
	public void testA(){
	Assert.assertEquals("Gmail", "Gmail");
	}
	@Test
	public void testC(){
	Assert.assertEquals("Gmail", "Google");
	}
	@Test
	public void testB(){
	Assert.assertEquals("Yahoo", "Yahoo");
	}
	
}
