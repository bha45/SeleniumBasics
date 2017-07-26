/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Images {

	public static void main(String[] args) {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// The below method will maximize the browser window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("https://www.google.co.in");

		// This line will check the presence of image
		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));

		// This line will navigate the below url and click image button
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();

		// This line will navigate the below url and click image link
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();

	}

}
