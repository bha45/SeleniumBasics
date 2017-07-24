package TestNGtests;

import org.testng.annotations.Test;

public class Dependsonmethods 
{
	@Test
	public void login()
	{
	System.out.println("Login Successful");
	}
	@Test (dependsOnMethods = {"login"})
	public void search()
	{
	System.out.println("Search Successful");
	}
	@Test (dependsOnMethods = {"search"})
	public void advancedSearch()
	{
	System.out.println("Advanced Search Successful");
	}
	@Test (dependsOnMethods = {"advancedSearch"})
	public void logout()
	{
	System.out.println("Logout Successful");
	}
	
}
