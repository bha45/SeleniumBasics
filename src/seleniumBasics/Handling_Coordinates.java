/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Coordinates {

	public static void main(String ar[]) throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Launching Google Web site
		driver.get("https://www.google.com/");

		// Finding Screen X and Y Coordinates
		Point point = driver.manage().window().getPosition();
		System.out.println("X coordinate of Screen " + point.getX());
		System.out.println("Y coordinate of Screen " + point.getY());
		Thread.sleep(2000);

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Finding Screen X and Y Coordinates after maximizing Window size
		Point point1 = driver.manage().window().getPosition();
		System.out.println("X coordinate of Screen " + point1.getX());
		System.out.println("Y coordinate of Screen " + point1.getY());
		Thread.sleep(2000);

		// Finding Element's X and Y Coordinates
		Point pointElement = driver.findElement(By.xpath("//*[@name='btnK']")).getLocation();
		System.out.println("X coordinate of GoogleSearchBtn " + pointElement.getX());
		System.out.println("Y coordinate of GoogleSearchBtn " + pointElement.getY());
		Thread.sleep(2000);

		// It will close the Browser window
		driver.close();
	}

}
