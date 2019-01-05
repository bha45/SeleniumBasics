/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Handling_AutoComplete {

	// Declaring variables
	WebDriver driver;
	WebDriverWait wait;

	String URL = "http://jqueryui.com/autocomplete/";
	private By frameLocator = By.className("demo-frame");
	private By tagText = By.id("tags");

	@BeforeClass
	public void Setup() {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, 5);
	}

	@Test
	public void rightClickTest() {

		// Navigate to the below URL after browser launch
		driver.navigate().to(URL);

		WebElement frameElement = driver.findElement(frameLocator);

		// Switching to Frame
		driver.switchTo().frame(frameElement);

		wait.until(ExpectedConditions.presenceOfElementLocated(tagText));
		WebElement textBoxElement = driver.findElement(tagText);
		textBoxElement.sendKeys("a");
		selectOptionWithText("Java");

	}
	
	@AfterClass
	public void Shutdown() {
	
		//It will close the Browser window
		driver.close();
	}

	// The below method will select the option from DropDown with the text entered
	// in text field
	public void selectOptionWithText(String textToSelect) {
		try {
			WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			// Getting list of Options from DropDown
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));

			// Selecting value from Auto list options in check with text sent to select
			for (WebElement option : optionsToSelect) {
				if (option.getText().equals(textToSelect)) {
					System.out.println("Trying to select: " + textToSelect);
					option.click();
					break;
				}
			}

		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}