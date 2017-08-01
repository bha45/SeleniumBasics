package screenCaptureMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CustomerLogin {

	public static WebDriver driver;
	
	static String path = "./SreenShots/"+System.nanoTime()+".png";
	/*static String path = "./SreenShots/1.png";
	static String path1 = "./SreenShots/2.png";*/
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		driver = new FirefoxDriver();

		// Launching the browser with the below url
		driver.get("http://gcrit.com/build3/");

		driver.findElement(By.linkText("login")).click();
		CustomerLogin.takesnap(driver, "./SreenShots/"+System.nanoTime()+".png");
		
		driver.findElement(By.name("email_address")).sendKeys("testjaga007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("jaga@12345");
		driver.findElement(By.id("tdb5")).click();
		CustomerLogin.takesnap(driver, "./SreenShots/"+System.nanoTime()+".png");

		// Capturing the Current page url
		String url = driver.getCurrentUrl();

		// Verifying the captured url
		if (url.contains("http://www.gcrit.com/build3/index.php")) 
		{
			System.out.println("Login Successful - Passed");
		} 
		else 
		{
			System.out.println("Login Unsuccessful - Failed");
		}

		// The below method will close the current browser window
		driver.close();

	}

	public static void takesnap(WebDriver driv, String filepath) throws IOException {

		TakesScreenshot src = ((TakesScreenshot) driv);
		File source = src.getScreenshotAs(OutputType.FILE);
		File destination = new File(filepath);
		FileUtils.copyFile(source, destination);

	}
}
