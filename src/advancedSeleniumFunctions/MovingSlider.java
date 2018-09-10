package advancedSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovingSlider {

	public static void main(String ar[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");

		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle')]"));

		Actions move = new Actions(driver);
		
		//To move the Slider in Forward direction
		move.dragAndDropBy(slider, 50, 0).build().perform();
		Thread.sleep(2000);
		
		//To move the Slider in Backward direction
		move.dragAndDropBy(slider, -20, 0).build().perform();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
