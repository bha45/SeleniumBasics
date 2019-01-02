/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Synchronization {

	public static void main(String[] args) throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Unconditional Synchronization - It will wait even after the element is
		// visible/present
		// Launching the browser with the below url
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();

		// Conditional Synchronization - It will wait till the element is
		// visible/present
		// Launching the browser with the below url
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail")).click();

		// It will close the Browser window
		driver.close();
	}

}
