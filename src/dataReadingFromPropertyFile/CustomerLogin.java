/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as dataReadingFromPropertyFile
package dataReadingFromPropertyFile;

// Importing the predefined class libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

// The class is created with name : CustomerLogin
public class CustomerLogin {

	// The global variables are declared
	public static Properties Repository = new Properties();
	public File fe;
	public FileInputStream FI;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public WebElement element;

	/**
	 * This method will fetch the Test Data from the Property file
	 * 
	 * @param property
	 * 
	 * @author Jagatheshwaran
	 */
	public String getTestData(String property) throws InvocationTargetException {

		// The property file is assigned to the File object (fe)
		fe = new File(System.getProperty("user.dir") + "//src//dataReadingFromPropertyFile//config.properties");
		try {
			
			// The file object (fe) is assigned to FileInputStream object (FI) to read the property file
			FI = new FileInputStream(fe);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// The below line will used to load the property file which is assigned to the FileInputStream object (FI)
			Repository.load(FI);

		} catch (IOException e) {
			e.printStackTrace();
		}
		String PropData = Repository.getProperty(property);

		try {

			String data = PropData.trim();
			return data;
		} catch (IllegalStateException e) {
			return null;
		}

	}

	public static void main(String[] args) throws InvocationTargetException {
		
		// The object of class CustomerLogin is created
		CustomerLogin c = new CustomerLogin();
		
		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Test Data taken from Property file
		String url = c.getTestData("url");
		String username = c.getTestData("username");
		String password = c.getTestData("password");
		
		// Launching the browser with the below url	
		driver.get(url);
	
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb5")).click();

		// Capturing the Current page url
		String curl = driver.getCurrentUrl();

		// Verifying the captured url
		if (curl.contains("http://www.gcrit.com/build3/index.php")) 
		{
			System.out.println("Login Successful - Passed");
		} 
		else 
		{
			System.out.println("Login Unsuccessful - Failed");
		}

		// The below method will close the current browser window
		driver.close();

	}
}
