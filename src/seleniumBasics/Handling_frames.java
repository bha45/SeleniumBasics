package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Frames {

	public static void main(String[] args) throws InterruptedException {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// The below method will maximize the browser window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");

		// Switching to frame is done by 2 ways as follows,

		// Using frame index - It will switch to frame by index
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();

		// Using frame name - It will switch to frame by name
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();

		// Default content - It will switch back to default content from frame
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();

	}

}
