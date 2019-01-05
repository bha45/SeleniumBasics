/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as screenCaptureMethod
package seleniumBasics;

// Importing the predefined class libraries
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// The class is created with name : CustomerLogin
public class Handling_ScreenShot {

	// The global variable is declared
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		driver = new FirefoxDriver();

		// Launching the browser with the below url
		driver.get("http://gcrit.com/build3/");

		driver.findElement(By.linkText("login")).click();
		
		// Calling takesnap method - It will capture the screenshot with the System Time as Screenshot name
		Handling_ScreenShot.takesnap(driver, "./SreenShots/"+System.nanoTime()+".png");
		
		driver.findElement(By.name("email_address")).sendKeys("testjaga007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("jaga@12345");
		driver.findElement(By.id("tdb5")).click();
		
		// Calling takesnap method - It will capture the screenshot with the System Time as Screenshot name
		Handling_ScreenShot.takesnap(driver, "./SreenShots/"+System.nanoTime()+".png");

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
	
	/** 
	 * The method name is : takesnap - It will used to capture the screenshot 
	 * @param - driv
	 * @param - filepath
	 */
	public static void takesnap(WebDriver driv, String filepath) throws IOException {

		// Convert web driver object (driv) to TakeScreenshot
		TakesScreenshot src = ((TakesScreenshot) driv);
		
		// Call getScreenshotAs method to create screenshot as image file
		File source = src.getScreenshotAs(OutputType.FILE);
		
		// Create new destination file - It will be used to store the captured screenshot
		File destination = new File(filepath);
		
		// FileUtils.copyFile - It is used to copy screenshot from source file to destination file
		FileUtils.copyFile(source, destination);
		
		//File sourceImage = ((TakesScreenshot) driv).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(sourceImage, destination);

	}
}
