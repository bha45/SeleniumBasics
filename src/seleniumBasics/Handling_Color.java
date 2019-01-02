/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_Color {

	public static void main(String ar[]) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching gitHub Web site
		driver.get("https://github.com/jagatheshwaran");

		// Comparing Button Color
		String expectedSignUpButtonBGColor = "rgba(40, 167, 69, 1)";

		String actualSignUpButtonBGColor = driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]"))
				.getCssValue("background-color");

		System.out.println(actualSignUpButtonBGColor);

		Assert.assertEquals(actualSignUpButtonBGColor, expectedSignUpButtonBGColor);

		// Comparing TextBox Color
		String expectedSignUpButtonTextColor = "rgba(255, 255, 255, 1)";

		String actualSignUpButtonTextColor = driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]"))
				.getCssValue("color");

		System.out.println(actualSignUpButtonTextColor);

		Assert.assertEquals(actualSignUpButtonTextColor, expectedSignUpButtonTextColor);

		// It will close the Browser window
		driver.close();

	}
}
