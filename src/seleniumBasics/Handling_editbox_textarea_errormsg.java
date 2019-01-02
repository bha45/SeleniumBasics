/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Editbox_Textarea_ErrorMsg {

	public static void main(String[] args) throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Edit box - Launching the browser with the below url
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("jaga");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).clear();
		System.out.println(driver.findElement(By.id("Email")).getAttribute("type"));

		// Using WebElement - Launching the browser with the below url
		driver.get("https://www.gmail.com");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("jaga");
		email.clear();

		System.out.println(email.isDisplayed());
		System.out.println(email.isEnabled());

		// Text Area - The below lines will capture the text area of Gmail
		driver.get("https://www.gmail.com");
		String text = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1")).getText();
		System.out.println(text);

		// Error Message - The below lines will capture the error message text
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath(".//*[@id='login-signin']s")).click();
		String error = driver.findElement(By.id("mbr-login-error")).getText();
		System.out.println(error);

		// It will close the Browser window
		driver.close();

	}

}
