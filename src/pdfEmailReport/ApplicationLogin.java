package pdfEmailReport;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author Jagatheshwaran
 */

//The below line will listen test execution
@Listeners(PdfReportListener.class)
public class ApplicationLogin extends takeSnapShot {

	// The global variable is declared
	public static WebDriver driver;

	@Test
	public static void loginToApplication() {

		// Driver instance created
		driver = takeSnapShot.getDriver();

		// Maximize Browser window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("http://gcrit.com/build3/");

		driver.findElement(By.linkText("login")).click();

		driver.findElement(By.name("email_address")).sendKeys("testjaga007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("jaga@123456");
		driver.findElement(By.id("tdb5")).click();

		// Capturing the Current page url
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://www.gcrit.com/build3/index.php";

		// Verifying the captured url
		if (url.contains("http://www.gcrit.com/build3/index.php")) {

			System.out.println("Login Successful - Passed");
			Assert.assertEquals(url, expectedUrl);

		} else {
			
			System.out.println("Login Unsuccessful - Failed");
			Assert.assertEquals(url, expectedUrl);
		}

	}

	@AfterTest
	public void tearDown() throws IOException, InterruptedException, CoreException {

		// The below line will close the browser window
		driver.close();

		PdfGeneration.sendPDFReportByMail("testjaga003@gmail.com", "jaga@2983", "testjaga005@gmail.com",
				"Test Execution Report", "Please find the test execution report");
	}

}
