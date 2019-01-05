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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_ToolTip {

	// Declaring the global variable declared
	public static WebDriver driver;

	public static void main(String ar[]) throws InterruptedException {

		toolTipWithoutActions();
		toolTipWithActions();
	}

	// The below method will handle ToolTip functionality without using Actions
	// class
	public static void toolTipWithoutActions() throws InterruptedException {

		String baseURL = "http://docs.seleniumhq.org";

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching Browser with below URL
		driver.get(baseURL);

		WebElement toolTip = driver.findElement(By.xpath(".//*[@id='menu_projects']/a"));
		String toopTipText = toolTip.getAttribute("title");
		System.out.println("ToolTip Text " + toopTipText);
		Thread.sleep(2000);

		// It will close the Browser window
		driver.close();
	}

	// The below method will handle ToolTip functionality using Actions class
	public static void toolTipWithActions() throws InterruptedException {

		String baseURL = "https://jqueryui.com/tooltip/";

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching Browser with below URL
		driver.get(baseURL);

		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		//Switching into Frame
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement input = driver.findElement(By.cssSelector("#age"));
	
		//Invoking Actions class with driver instance
		Actions action = new Actions(driver);
		
		//The below line will hover action on the input
		action.moveToElement(input).build().perform();
		WebElement toolTip = driver.findElement(By.cssSelector(".ui-tooltip-content"));

		String toopTipText = toolTip.getText();
		System.out.println("ToolTip Text " + toopTipText);
		Thread.sleep(2000);

		// It will close the Browser window
		driver.close();
	}
}
