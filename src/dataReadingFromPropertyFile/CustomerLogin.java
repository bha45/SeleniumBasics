package dataReadingFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerLogin {

	public static Properties Repository = new Properties();
	public File fe;
	public FileInputStream FI;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public WebElement element;

	/**
	 * This method will initialize and load the Property file
	 * 
	 * @author Jagatheshwaran
	 */
	public void loadProperties() throws IOException {
		fe = new File(System.getProperty("user.dir") + "//src//dataReadingFromPropertyFile//config.properties");
		FI = new FileInputStream(fe);
		Repository.load(FI);

	}

	/**
	 * This method will fetch the Test Data from the Property file
	 * 
	 * @param property
	 * 
	 * @author Jagatheshwaran
	 */
	public String getTestData(String property) throws InvocationTargetException {

		fe = new File(System.getProperty("user.dir") + "//src//dataReadingFromPropertyFile//config.properties");
		try {
			FI = new FileInputStream(fe);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
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
		
		CustomerLogin c = new CustomerLogin();
		
		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// Test Data taken from Property file
		String url = c.getTestData("url");
		String username = c.getTestData("username");
		String password = c.getTestData("password");
		
		// Launching the browser with the below url
		
		driver.get(url);
	
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath(".//*[@name='email_address']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys(password);
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
