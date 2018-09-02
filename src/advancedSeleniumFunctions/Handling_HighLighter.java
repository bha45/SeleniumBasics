/**
 * @author Jagatheshwaran
 * 
 */
package advancedSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_HighLighter {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Launching the browser with the below url
		driver.get("http://www.gcrit.com/build3/admin/login.php");

		WebElement username = driver.findElement(By.name("username"));
		Handling_HighLighter.highLightElement(driver, username);
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("password"));
		Handling_HighLighter.highLightElement(driver, password);
		password.sendKeys("admin@123");
		WebElement login = driver.findElement(By.id("tdb1"));
		Handling_HighLighter.highLightElement(driver, login);
		login.click();

		// Capturing the current page url
		String Actualurl = driver.getCurrentUrl();
		System.out.println(Actualurl);

		// It is the Expected url
		String Expectedurl = "http://www.gcrit.com/build3/admin/index.php";

		// Verifying the captured the url
		if (Expectedurl.equals(Actualurl)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		// The below method will close the current browser window
		driver.quit();
	}

	// HighLighter function
	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid green;');",
				element);
	}
}
