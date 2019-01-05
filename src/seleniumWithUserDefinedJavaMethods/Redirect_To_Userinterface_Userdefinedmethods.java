/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as seleniumBasics_With_JavaMethods
package seleniumWithUserDefinedJavaMethods;

// Importing the predefined class libraries
import org.openqa.selenium.By;

// The class is created with name : Redirect_To_Userinterface_Userdefinedmethods
// The class Redirect_To_Userinterface_Userdefinedmethods is extends the class AdminLogin_Userdefinedmethods to use the methods of the class AdminLogin_Userdefinedmethods
public class Redirect_To_Userinterface_Userdefinedmethods extends AdminLogin_Userdefinedmethods
{

	public static void main(String[] args) 
	{
		
		// Object of the class Redirect_To_Userinterface_Userdefinedmethods is created
		Redirect_To_Userinterface_Userdefinedmethods object = new Redirect_To_Userinterface_Userdefinedmethods();
		
		// The below methods are accessed by the object
		object.launchBrowser();
		object.adminLogin("admin","admin@123");
		
		driver.findElement(By.linkText("Online Catalog")).click();
		
		// Capturing the current page url
		String url = driver.getCurrentUrl();

		// Verifying the captured the url
		if (url.equals("http://www.gcrit.com/build3/"))
		{
		System.out.println("Redirected to User Interface -Passed");	
		}
		else 
		{
		System.out.println("Redirected to User Interface -Failed");	
		}
		
		object.closeBrowser();

	}

}
