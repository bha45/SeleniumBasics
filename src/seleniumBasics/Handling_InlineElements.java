/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_InlineElements {

	public static void main(String[] args) {
		
		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// The below method will maximize the browser window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		// These below lines will navigate to the google home page and click the apps icon
		// Then drag the apps and click the inline app
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();

		// For more links with in the Apps
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='gb300']/span[1]")).click();

	}

}
