/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as pageScrollAndZoom
package seleniumBasics;

// Importing the predefined class libraries
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// The class is created with name : PageScroll
public class Handling_PageScroll {

	public static void main(String[] args) throws InterruptedException {
		
		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// Launching the browser with the below url
		driver.get("http://automationpractice.com/index.php");
	
		// JavascriptExecutor is used to perform the page scroll - it will scroll to down of the page
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		// JavascriptExecutor is used to perform the page scroll - it will scroll to top of the page
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");

		Thread.sleep(2000);
		
		// JavascriptExecutor is used to perform the page scroll - it will scroll to fixed position
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		// JavascriptExecutor is used to perform the page scroll - it will scroll to fixed position
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-200)");
		
		Thread.sleep(2000);
		
		// JavascriptExecutor is used to perform the page scroll - it will scroll to fixed position based on Object location
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(".//*[@id='homefeatured']//a[contains(text(),'Faded Short Sleeve T-shirts')]")));
	
		// This will close the Browser window
		driver.close();
		
	}
	
}
