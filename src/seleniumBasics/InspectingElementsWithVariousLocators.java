/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectingElementsWithVariousLocators 
{

	public static void main(String[] args) throws InterruptedException {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Launching the browser with the below url
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");

		// Inspecting Element by id
		driver.findElement(By.id("Email")).sendKeys("testjaga007");

		// Inspecting Element by name
		driver.findElement(By.name("Email")).sendKeys("testjaga007");

		// Inspecting Element by cssSeletor
		driver.findElement(By.cssSelector("#Email")).sendKeys("testjaga007");

		// Inspecting Element by Xpath
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("testjaga007");
		driver.findElement(By.name("Email")).clear();

		// Launching the browser with the below url
		driver.get("https://www.google.co.in/");

		// Inspecting Element by linkText
		driver.findElement(By.linkText("Gmail")).click();

		// Inspecting Element by partialLinkText
		driver.findElement(By.partialLinkText("mail")).click();

		// Inspecting Element by className
		driver.findElement(By.className("gb_P")).click();

		// Launching the browser with the below url
		driver.get("https://www.facebook.com/");
		driver.findElement(By.tagName("input")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).clear();

		// The below lines will show the simple example for sendkeys and clear methods
		WebElement jaga = driver.findElement(By.id("Email"));
		jaga.sendKeys("jagathesh298");
		Thread.sleep(3000);
		jaga.clear();
		Thread.sleep(3000);

		driver.close();

	}

}
