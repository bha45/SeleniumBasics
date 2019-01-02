/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_TextBoxSize {

	public static void main(String ar[]) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching Browser with below URL
		driver.get("https://www.google.com/");

		// Retrieving TextBox Element width and height
		int googleSearchBtnWidth = driver.findElement(By.xpath("//*[@name='btnK']")).getSize().getWidth();
		System.out.println("Width of googleSearchBtn : " + googleSearchBtnWidth);
		int googleSearchBtnHeight = driver.findElement(By.xpath("//*[@name='btnK']")).getSize().getHeight();
		System.out.println("Height of googleSearchBtn : " + googleSearchBtnHeight);

		// It will close the Browser window
		driver.close();
	}

}
