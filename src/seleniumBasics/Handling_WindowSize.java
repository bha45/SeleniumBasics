package seleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WindowSize {

	public static void main(String ar[]) throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Launching Browser window with below URL
		driver.get("https://github.com/jagatheshwaran");

		// Getting Window Size
		Dimension windowSize = driver.manage().window().getSize();
		System.out.println("Actaul Window Size " + windowSize);

		// To maximize Browser Window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Setting Window Size
		Dimension dimension = new Dimension(800, 600);
		driver.manage().window().setSize(dimension);
		Thread.sleep(2000);

		Dimension setWindowSize = driver.manage().window().getSize();
		System.out.println("Set Window Size " + setWindowSize);

		// It will close the Browser window
		driver.close();
	}
}
