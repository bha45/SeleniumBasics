/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Form {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("http://gcrit.com/build3/");

		// Filling Form to Register and Create Account
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"))
				.click();
		driver.findElement(By.name("firstname")).sendKeys("jaga");
		driver.findElement(By.name("lastname")).sendKeys("waran");
		driver.findElement(By.name("dob")).sendKeys("08/30/1994");
		driver.findElement(By.name("email_address")).sendKeys("testjaga001@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("TamilNadu");
		driver.findElement(By.name("postcode")).sendKeys("600001");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");

		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("India");

		driver.findElement(By.name("telephone")).sendKeys("9944551212");
		driver.findElement(By.name("password")).sendKeys("jaga1994");
		driver.findElement(By.name("confirmation")).sendKeys("jaga1994");
		driver.findElement(By.id("tdb4")).click();

		// Capturing the Success message after account creation
		String ConformationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();

		// Verifying the captured success message
		if (ConformationMessage.equals("Your Account Has Been Created!")) {

			System.out.println("Customer Registration Successful - Passed");

		} else {

			System.out.println("Customer Registration Unsuccessful - Failed");
		}

		// It will close the Browser window
		driver.close();

	}

}
