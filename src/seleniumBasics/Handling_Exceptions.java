/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Exceptions {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("https://www.google.co.in");

		// Without Try and Catch
		if (driver.findElement(By.linkText("Gmaila")).isDisplayed()) {
			
			System.out.println("Gmail Link Exist - Passed");
			
		} else {
			
			System.out.println("Gmail Link Exist - Failed");
		}

		// Exception Handling using Try and catch
		try {

			if (driver.findElement(By.linkText("Gmaila")).isDisplayed()) {
				
				System.out.println("Gmail Link Exist - Passed");
			}
		}

		catch (NoSuchElementException e) {
			
			System.out.println("Gmail Link Exist - Failed");
		}
		
		// It will close the Browser window
		driver.close();
	}
	

}
