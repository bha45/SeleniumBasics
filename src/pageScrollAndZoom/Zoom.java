package pageScrollAndZoom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zoom {

	public static void main(String[] args) throws InterruptedException {
	
		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Launching the browser with the below url
		driver.get("http://automationpractice.com/index.php");
	
		// JavascriptExecutor is used to perform the page Zoom - it will Zoom in to 50%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='50%'");
		
		Thread.sleep(3000);
		
		// JavascriptExecutor is used to perform the page scroll - it will Zoom out to 100%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");

		Thread.sleep(3000);
		
		// JavascriptExecutor is used to perform the page scroll - it will Zoom in to 70%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='70%'");
		
		Thread.sleep(3000);
		
		// JavascriptExecutor is used to perform the page scroll - it will Zoom out to 100%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");
		
		// This will close the Browser window
		driver.close();
		


	}

}
