package testNG_Parallel_Grouping;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class BeforeClass_Test_AfterClass {
	
	@BeforeClass
	public void login() {
		System.out.println("Login to Ecommerce Site Successful");
	}

	@Test(priority = 1)
	public void searchProduct() {
		System.out.println("Browse and Search of Product Successful");
	}

	@Test(priority = 2)
	public void addProduct() {
		System.out.println("Add Product to Cart Successful");
	}

	@Test(priority = 3)
	public void addAddress() {
		System.out.println("Add Shipping Details Successful");
	}

	@Test(priority = 4)
	public void payMoney() {
		System.out.println("Add Payment Method Successful");
	}

	@Test(priority = 5)
	public void placeOrder() {
		System.out.println("Place Order Successful");
	}

	@AfterClass
	public void logout() {
		System.out.println("Logout of Ecommerce Site Successful");
	}
}
