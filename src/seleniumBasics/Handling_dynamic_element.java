package seleniumBasics;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_dynamic_element {

	public static void main(String[] args) {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// Launching the browser with the below url
		driver.get("https://www.irctc.co.in/");

		// For Username and Password - use your own credentials
		driver.findElement(By.id("usernameId")).sendKeys("jaga1994");
		driver.findElement(By.className("loginPassword")).sendKeys("jpo894");

		@SuppressWarnings("resource")
		// Scanner will used to get the input from the User
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Captacha");
		String cap = scan.nextLine();

		// The Captacha entered by the User will send to the Captacha text box
		driver.findElement(By.className("loginCaptcha")).sendKeys(cap);
		driver.findElement(By.id("loginbutton")).click();

		// Capturing the current page url
		String url = driver.getCurrentUrl();

		// Verifying the captured the url
		if (url.equals("https://www.irctc.co.in/eticketing/home")) {
			System.out.println("Login Successful - Passed");
		} else {
			System.out.println("Login UnSuccessful - Failed");
		}

	}

}
