/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as seleniumBasics_With_JavaMethods
package seleniumBasics_With_JavaMethods;

// Importing the predefined class libraries
import org.openqa.selenium.By;

// The class is created with name : MultipleTestcases_Userdefined
// The class MultipleTestcases_Userdefined is extends the class AdminLogin_Userdefinedmethods to use the methods of the class AdminLogin_Userdefinedmethods
public class MultipleTestcases_Userdefined extends AdminLogin_Userdefinedmethods
{

    public static void main(String[] args) 
	{
    	
    	// Object of the class MultipleTestcases_Userdefined is created
    	MultipleTestcases_Userdefined obj4 = new MultipleTestcases_Userdefined();
    	
    	
    	// Test Case 1: Redirect to user Interface(Login)  from Admin Interface(Login)
    	
    	// The below methods are accessed by the object
    	obj4.launchBrowser();
    	obj4.adminLogin("admin", "admin@123");
    	
    	driver.findElement(By.linkText("Online Catalog")).click();
    	
    	// Capturing the current page url
    	String url = driver.getCurrentUrl();

    	// Verifying the captured the url
    	if (url.equals("http://www.gcrit.com/build3/"))
    	{
    	System.out.println("Test Case 1: -Redirected to User Interface -Passed");	
    	}
    	else 
    	{
    	System.out.println("Test Case 1: Redirected to User Interface -Failed");	
    	}
    	
    	obj4.closeBrowser();
    	
    	
    	// Test Case 2: Admin Login Functionality with valid inputs(Positive Test Case)
    	
    	// The below methods are accessed by the object
    	obj4.launchBrowser();
    	obj4.adminLogin();
    	
    	// Capturing the current page url
    	String url2 = driver.getCurrentUrl();

    	// Verifying the captured the url
    	if (url2.contains("http://www.gcrit.com/build3/admin/index.php"))
    	{
    	System.out.println("Test Case 2: Admin Login Successful - Passed");	
    	}
    	else 
    	{
    	System.out.println("Test Case 2: Admin Login Unsuccessful - Failed");	
    	}
    	
    	obj4.closeBrowser();
    	
    	// Test Case 3: Admin Login Functionality with invalid inputs(Negative Test Case)
    	
    	// The below methods are accessed by the object
    	obj4.launchBrowser();
    	obj4.adminLogin("admina", "admin@123a");
    	
    	// Capturing the Error message
    	String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

    	// The captured Error message is verified
    	if (ErrorMessage.contains("Error: Invalid administrator login attempt."))
    	{
    	System.out.println("Test Case 3: Handling Invalid Inputs - Passed");	
    	}
    	else 
    	{
    	System.out.println("Test Case 3: Not Handling Invalid Inputs - Failed");
    	}
    	
    	obj4.closeBrowser();

	}

}
