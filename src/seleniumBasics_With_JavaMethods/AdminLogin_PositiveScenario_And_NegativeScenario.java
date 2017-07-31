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


// The class is created with name : AdminLogin_PositiveScenario_And_NegativeScenario
public class AdminLogin_PositiveScenario_And_NegativeScenario 
{

	// Declaring global variables
	public static int i;
	public static String username, password, iteration;
	
	public static void main(String[] args) throws InterruptedException 
	{
		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");
		
		// Driver instance is created
		WebDriver driver=new FirefoxDriver();
		
	
		for (i = 1; i <= 2; i++)
		{
		if (i == 1)	
		{
		
		iteration = "Iteration 1";	
		username = "admin";
		password = "admin@123";
		
		}
		else if(i == 2)
		{
		
		iteration = "Iteration 2";
		username = "admina";
		password = "admin@123a";
			
		}

		// Launching the browser with the below url
		driver.get("http://www.gcrit.com/build3/admin/");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("tdb1")).click();

		// Verifying positive scenario
		
		// Capturing the current page url
		String url = driver.getCurrentUrl();

		// Verifying the captured the url	
		if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
		{
		System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Admin Login Successful - Passed");
		driver.findElement(By.linkText("Logoff")).click();
		Thread.sleep(2000);
		}
		
		// Verifying negative scenario
		else if (!url.contains("http://www.gcrit.com/build3/admin/index.php"))
		{
			
		// Capturing the Error message
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		
		// Verifying the captured Error message
		if (ErrorMessage.contains("Invalid administrator login attempt."))
		{
		System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Handling Invalid Inputs - Passed");
		}
		else 
		{
		System.out.println(iteration +  "- Failed");
		}
		}
		}
		
		// The below method will close the browser window
		driver.close();

	}

}
