package advancedSeleniumFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_MultipleSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Create a new instance of the FireFox driver
		WebDriver driver = new ChromeDriver();

		// Have an Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");

		Select select = new Select(driver.findElement(By.name("selenium_commands")));
		
		boolean selectMulti = select.isMultiple();
		System.out.println("Multiple select : "+selectMulti);
		
		select.selectByIndex(0);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.deselectAll();

		select.selectByIndex(0);
		Thread.sleep(2000);
		select.deselectByIndex(0);

		select.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		select.deselectByVisibleText("Navigation Commands");

		List<WebElement> optionsSize = select.getOptions();
		int listSize = optionsSize.size();

		for (int i = 0; i < listSize; i++) {

			String options = select.getOptions().get(i).getText();
			System.out.println(options);
			select.selectByIndex(i);
			Thread.sleep(2000);
		}

		select.deselectAll();

		driver.close();
	}
}