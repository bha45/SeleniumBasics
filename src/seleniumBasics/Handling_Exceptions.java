package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Exceptions {

	public static void main(String[] args) {

		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

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
	}

}
