/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Link {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("https://www.google.co.in");

		// link text - It will click the Gmail using linkText
		driver.findElement(By.linkText("Gmail")).click();

		// partial link text - It will click the Gmail using PartillinkText
		driver.findElement(By.partialLinkText("Gma")).click();

		// link text - A web element is created and it will click the Gmail using
		// linkText
		WebElement mail = driver.findElement(By.linkText("Gmail"));
		mail.click();
		boolean mstatus = mail.isDisplayed();
		System.out.println(mstatus);

		// It will close the Browser window
		driver.close();

	}

}
