package seleniumBasics;

import org.openqa.selenium.By;

public class Admin_login_neg_userdefined extends Admin_login_Userdefinedmethods
{

	
	public static void main(String[] args) 
	{
		Admin_login_neg_userdefined obj3 = new Admin_login_neg_userdefined();
		
		obj3.launchBrowser();
		obj3.adminLogin("admina", "admin@123a");
		
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

		if (ErrorMessage.contains("Error: Invalid administrator login attempt."))
		{
		System.out.println("Handling Invalid Inputs - Passed");	
		}
		else 
		{
		System.out.println("Not Handling Invalid Inputs - Failed");
		}
		obj3.closeBrowser();

	}

}
