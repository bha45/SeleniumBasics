package TestNG.Para.Group;

//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 
{
	//@BeforeClass
	@BeforeTest
	public void login()
	{
	System.out.println("Login Successful");
	}
	
	@Test (priority = 1)
	public void deleteVendor()
	{
	System.out.println("Delete Vendor Successful");	
	}
	
	
	@Test(priority = 2)
	public void deleteProduct()
	{
	System.out.println("Delete Product Successful");	
	}
	
	@Test(priority = 3)
	public void deleteCurrency()
	{
	System.out.println("Delete Currency Successful");	
	}
	
	//@AfterClass
	@AfterTest
	public void logout()
	{
	System.out.println("Logout Successful");
	}

}
