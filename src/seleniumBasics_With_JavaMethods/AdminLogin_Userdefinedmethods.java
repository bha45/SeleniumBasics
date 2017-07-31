/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as seleniumBasics_With_JavaMethods
package seleniumBasics_With_JavaMethods;

// Importing the predefined class libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// The class is created with name : AdminLogin_Userdefinedmethods
public class AdminLogin_Userdefinedmethods {
	
	// The global variable is declared
	public static WebDriver driver;

	// The method launchBrowser is used to launch the browser
	public void launchBrowser() {

		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		driver = new FirefoxDriver();
	}

	// The method adminLogin is used to navigte to below url
	// Enter the Credentials and click Sigin
	// The adminLogin method without Parameters - It will directly pass the input data
	public void adminLogin() {
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}

	// The method adminLogin is used to navigte to below url
	// Enter the Credentials and click Sigin
	// The adminLogin method without Parameters - It will take the input data as parameters
	public void adminLogin(String username, String password) {
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}

	// The closeBrowser method is used to close the browser window
	public void closeBrowser() {
		if (!driver.toString().contains("null")) {
			driver.close();
		}
	}

	public static void main(String[] args) {

		// Object of the class AdminLogin_Userdefinedmethods is created
		AdminLogin_Userdefinedmethods obj = new AdminLogin_Userdefinedmethods();

		// The below methods are accessed by the object
		obj.launchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		obj.launchBrowser();
		// The input data is passed as parameters
		obj.adminLogin("admin", "admin@123");
		obj.closeBrowser();

	}

}
