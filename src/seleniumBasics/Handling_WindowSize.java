package seleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WindowSize {

	public static void main(String ar[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/jagatheshwaran");

		Dimension windowSize = driver.manage().window().getSize();
		System.out.println("Actaul Window Size " + windowSize);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		Dimension dimension = new Dimension(800, 600);
		driver.manage().window().setSize(dimension);
		Thread.sleep(2000);

		Dimension setWindowSize = driver.manage().window().getSize();
		System.out.println("Set Window Size " + setWindowSize);

		driver.close();
	}
}
