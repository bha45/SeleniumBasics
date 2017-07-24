package testNG_Parallel_Grouping;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest3 
{

	//@Test(groups = {"sanity", "regression"}, priority =1)
	@BeforeGroups
	public void login()
	{
	System.out.println("Login Successful");
	}
	
	@Test (groups = {"sanity"}, priority =3)
	public void fundTransfer()
	{
	System.out.println("Fund Transfer Successful");
	}
	
	@Test(groups = {"sanity"}, priority =2)
	public void search()
	{
	System.out.println("Search Successful");
	}
	
	@Test (groups = {"regression"}, priority =2)
	public void advancedSearch()
	{
	System.out.println("Advanced Search Successful");
	}
	
	@Test(groups = {"regression"}, priority =3)
	public void prePaidRecharge()
	{
	System.out.println("PrePaid Recharge Successful");
	}
	
	@Test(groups = {"regression"}, priority =4)
	public void billPayments()
	{
	System.out.println("Bill Payments Successful");
	}
	
	//@Test(groups = {"sanity", "regression"}, priority =10)
	@AfterGroups
	public void logout()
	{
	System.out.println("Logout Successful");
	}
}
