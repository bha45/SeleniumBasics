/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Mover {

	public static void main(String[] args) {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// The below method will maximize the browser window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("http://www.carmax.com/");

		// The Actions class is used to handle the mouse hand over operations

		// Instance of Actions class is created
		Actions builder = new Actions(driver);

		WebElement menu = driver.findElement(By.xpath("//*[@class='global-nav--link'][text()='Sell Your Car']"));
		builder.moveToElement(menu).build().perform();

		driver.findElement(By.linkText("Determining Your Offer")).click();
		
		System.out.println("Mover is done Successfully"); 

	}

}
