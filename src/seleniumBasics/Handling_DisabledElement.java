/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DisabledElement {

	public static void main(String ar[]) throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching Browser with below url
		driver.get(
				"file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/DisabledElement.html");

		WebElement textField = driver.findElement(By.xpath(".//*[@id='myText']"));
		textField.sendKeys("Jaga");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);

		// Retrieving value from Disabled element
		String textval = textField.getAttribute("value");
		System.out.println("Value From Disabled Element : " + textval);

		// JavaScript Function - It will enable the disabled element in current session
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].removeAttribute('disabled');", textField);
		Thread.sleep(1000);

		// Retrieving value from Enabled element
		String text = textField.getAttribute("value");
		System.out.println("Value From Enabled Element : " + text);

		// It will close Browser window
		driver.close();
	}

}
