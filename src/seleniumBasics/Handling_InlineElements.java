/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_InlineElements {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("https://www.google.com");

		// These below code navigate to the google home page and click the apps icon
		// Then drag the apps and click the inline app
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();

		// For more links with in the Apps
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='gb300']/span[1]")).click();

		// It will close the Browser window
		driver.close();

	}

}
