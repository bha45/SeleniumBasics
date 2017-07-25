package seleniumBasics_With_JavaMethods;

import org.openqa.selenium.By;

public class AdminLogin_NegativeScenario_Userdefined extends AdminLogin_Userdefinedmethods
{

	
	public static void main(String[] args) 
	{
		AdminLogin_NegativeScenario_Userdefined obj3 = new AdminLogin_NegativeScenario_Userdefined();
		
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
