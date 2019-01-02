/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_LoginFunctionality {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("http://gcrit.com/build3/");

		driver.findElement(By.linkText("login1")).click();
		driver.findElement(By.name("email_address")).sendKeys("testjaga007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("jaga@12345");
		driver.findElement(By.id("tdb5")).click();

		// Capturing the Current page url
		String url = driver.getCurrentUrl();

		// Verifying the captured url
		if (url.contains("http://www.gcrit.com/build3/index.php")) {
			System.out.println("Login Successful - Passed");
		} else {
			System.out.println("Login Unsuccessful - Failed");
		}

		// The below method will close the current browser window
		driver.close();

	}

}
