package testNG_Parallel_Grouping;

import org.testng.annotations.Test;

public class Test_With_Thread {
	
	@Test
	public void login() {
		long id = Thread.currentThread().getId();
		System.out.println("Login Test Case is Successful - Current Thread id is: " + id);
	}

	@Test
	public void search() {
		long id = Thread.currentThread().getId();
		System.out.println("Search Test Case is Successful - Current Thread id is: " + id);
	}

	@Test
	public void placeOrder() {
		long id = Thread.currentThread().getId();
		System.out.println("Place Order Test Case is Successful - Current Thread id is: " + id);
	}

	@Test
	public void logout() {
		long id = Thread.currentThread().getId();
		System.out.println("Logout Test Case is Successful - Current Thread id is: " + id);
	}

}
