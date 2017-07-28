package testNG_Parallel_Grouping;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void login() {
		System.out.println("Login to Ecommerce Site Successful");
	}

	@Test(dependsOnMethods = { "login" })
	public void search() {
		System.out.println("Browse and Search Product Successful");
	}

	@Test(dependsOnMethods = { "search" })
	public void logout() {
		System.out.println("Logout of Ecommerce Site Successful");
	}

}
