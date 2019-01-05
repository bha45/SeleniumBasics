/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_MouseOver {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
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

		// It will close the Browser window
		driver.close();
	}

}
