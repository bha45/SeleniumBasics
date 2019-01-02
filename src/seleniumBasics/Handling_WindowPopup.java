/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WindowPopup {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("http://www.rediffmail.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		// Alert class is used to handle Window Pop-ups
		// The instance of Alert class is created and switch to Alert from normal window
		Alert alertobj = driver.switchTo().alert();
		String error = alertobj.getText();
		System.out.println(error);
		alertobj.accept();

		// It will close the Browser window
		driver.close();
	}

}
