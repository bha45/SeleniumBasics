/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as seleniumBasics_With_JavaMethods
package seleniumWithUserDefinedJavaMethods;

// The class is created with name : AdminLogin_PositiveScenario_Userdefined
// The class AdminLogin_PositiveScenario_Userdefined is extends the class AdminLogin_Userdefinedmethods to use the methods of the class AdminLogin_Userdefinedmethods
public class AdminLogin_PositiveScenario_Userdefined extends AdminLogin_Userdefinedmethods
{

	public static void main(String[] args) 
	{
		// Object of the class AdminLogin_PositiveScenario_Userdefined is created
		AdminLogin_PositiveScenario_Userdefined obj2 = new AdminLogin_PositiveScenario_Userdefined();
		
		// The below methods are accessed by the object
		obj2.launchBrowser();
		obj2.adminLogin();
		
		//Capturing the current page url
		String url = driver.getCurrentUrl();

		//Verifying the captured the url
		if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
		{
		System.out.println("Admin Login Successful - Passed");	
		}
		else 
		{
		System.out.println("Admin Login Unsuccessful - Failed");	
		}
		
		obj2.closeBrowser();
	}

}
