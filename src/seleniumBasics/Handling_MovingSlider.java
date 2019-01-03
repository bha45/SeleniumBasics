/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_MovingSlider {

	public static void main(String ar[]) throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();
		
		// Launching the browser with the below url
		driver.get("http://jqueryui.com/slider/");

		// Switching to Frame
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle')]"));

		//Initializing Actions Class
		Actions move = new Actions(driver);

		// To move the Slider in Forward direction
		move.dragAndDropBy(slider, 50, 0).build().perform();
		Thread.sleep(2000);

		// To move the Slider in Backward direction
		move.dragAndDropBy(slider, -20, 0).build().perform();
		Thread.sleep(2000);

		// It will close the Browser window
		driver.close();

	}

}
