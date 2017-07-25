package seleniumBasics_With_JavaMethods;

import org.openqa.selenium.By;

public class MultipleTestcases_Userdefined extends AdminLogin_Userdefinedmethods
{

    public static void main(String[] args) 
	{
    	//Object instance of the class is created
    	MultipleTestcases_Userdefined obj4 = new MultipleTestcases_Userdefined();
    	
    	
    	//Test Case 1: Redirect to user Interface from Admin Interface
    	obj4.launchBrowser();
    	obj4.adminLogin("admin", "admin@123");
    	
    	driver.findElement(By.linkText("Online Catalog")).click();
    	
    	String url = driver.getCurrentUrl();

    	if (url.equals("http://www.gcrit.com/build3/"))
    	{
    	System.out.println("Test Case 1: -Redirected to User Interface -Passed");	
    	}
    	else 
    	{
    	System.out.println("Test Case 1: Redirected to User Interface -Failed");	
    	}
    	obj4.closeBrowser();
    	
    	
    	//Test Case 2: Admin Login Functionality with valid inputs(Positive Test Case)
    	obj4.launchBrowser();
    	obj4.adminLogin();
    	
    	String url2 = driver.getCurrentUrl();

    	if (url2.contains("http://www.gcrit.com/build3/admin/index.php"))
    	{
    	System.out.println("Test Case 2: Admin Login Successful - Passed");	
    	}
    	else 
    	{
    	System.out.println("Test Case 2: Admin Login Unsuccessful - Failed");	
    	}
    	obj4.closeBrowser();
    	
    	//Test Case 3: Admin Login Functionality with invalid inputs(Negative Test Case)
    	obj4.launchBrowser();
    	obj4.adminLogin("admina", "admin@123a");
    	
    	String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

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
