/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as seleniumBasics_With_JavaMethods
package seleniumWithUserDefinedJavaMethods;

// Importing the predefined class libraries
import org.openqa.selenium.By;

// The class is created with name : AdminLogin_NegativeScenario_Userdefined
// The class AdminLogin_NegativeScenario_Userdefined is extends the class AdminLogin_Userdefinedmethods to use the methods of the class AdminLogin_Userdefinedmethods
public class AdminLogin_NegativeScenario_Userdefined extends AdminLogin_Userdefinedmethods
{

	
	public static void main(String[] args) 
	{
		// Object of the class AdminLogin_NegativeScenario_Userdefined is created
		AdminLogin_NegativeScenario_Userdefined obj3 = new AdminLogin_NegativeScenario_Userdefined();
		
		// The below methods are accessed by the object
		obj3.launchBrowser();
		obj3.adminLogin("admina", "admin@123a");
		
		// Capturing the Error message
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

		// The captured Error message is verified
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
