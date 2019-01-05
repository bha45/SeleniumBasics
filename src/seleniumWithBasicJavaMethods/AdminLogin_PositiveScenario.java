/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as seleniumBasics_With_JavaMethods
package seleniumWithBasicJavaMethods;

// Importing the predefined class libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// The class is created with name : AdminLogin_PositiveScenario
public class AdminLogin_PositiveScenario {

	public static void main(String[] args) {
		
		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Launching the browser with the below url
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();

		// Capturing the current page url
		String url = driver.getCurrentUrl();

		// Verifying the captured the url
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")) 
		{
			System.out.println("Admin Login Successful - Passed");
		} 
		else 
		{
			System.out.println("Admin Login Unsuccessful - Failed");
		}
		
		// The below method will close the browser window
		driver.close();

	}

}
