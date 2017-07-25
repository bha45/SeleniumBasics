package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) {

		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// Launching the browser with the below url
		driver.get("http://www.gcrit.com/build3/admin/login.php");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();

		// Capturing the current page url
		String Actualurl = driver.getCurrentUrl();
		System.out.println(Actualurl);

		// It is the Expected url
		String Expectedurl = "http://www.gcrit.com/build3/admin/index.php";

		// Verifying the captured the url
		if (Expectedurl.equals(Actualurl)) 
		{
			System.out.println("passed");
		} 
		else 
		{
			System.out.println("failed");
		}

		// The below method will close the current browser window
		driver.close();
	}

}
