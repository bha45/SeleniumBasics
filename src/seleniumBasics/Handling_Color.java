package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_Color {

	public static void main(String ar[]) {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/jagatheshwaran");

		String expectedSignUpButtonBGColor = "rgba(40, 167, 69, 1)";
		String actualSignUpButtonBGColor = driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]"))
				.getCssValue("background-color");
		System.out.println(actualSignUpButtonBGColor);

		Assert.assertEquals(actualSignUpButtonBGColor, expectedSignUpButtonBGColor);

		String expectedSignUpButtonTextColor = "rgba(255, 255, 255, 1)";
		String actualSignUpButtonTextColor = driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]"))
				.getCssValue("color");
		System.out.println(actualSignUpButtonTextColor);

		Assert.assertEquals(actualSignUpButtonTextColor, expectedSignUpButtonTextColor);

		driver.close();

	}
}
