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

// The class is created with name : AdminLogin_NegativeScenario
public class AdminLogin_NegativeScenario {

	
	public static void main(String[] args) throws InterruptedException 
	{
		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");
		
		// Driver instance is created
		WebDriver driver=new FirefoxDriver();
		
		// Launching the browser with the below url
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admina");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();


		// Capturing the current page url
		String url = driver.getCurrentUrl();
		
		// Verifying the captured the url
		if (url.contains("http://www.gcrit.com/build3/admin/login.php"))
		{
		
		// Capturing the Error message
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

		// Verifying the Error message
		if (ErrorMessage.contains("Invalid administrator login attempt."))
		{
		System.out.println("Handling Invalid Inputs - Passed");
		}
		}
		else 
		{
		System.out.println("Not Handling Invalid Inputs - Failed");
		}
		Thread.sleep(3000);
		
		// The below method will close the browser window
		driver.close();


	}

}
