/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DropDownUsingList {

	static WebDriver driver;

	public static void select2ndLastElement() throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching Browser with below url
		driver.get(
				"file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/Dropdown_Input.html");

		WebElement Dropdown = driver.findElement(By.xpath(".//*[@id='browseroptions']"));
		Dropdown.click();

		// Taking list of Options from DropDown
		List<WebElement> options = driver.findElements(By.xpath(".//*[@id='browseroptions']/option"));
		System.out.println(options.size());
		Thread.sleep(2000);

		// It will select 2nd last option value in DropDown
		WebElement option = options.get(options.size() - 2);
		option.click();
		Dropdown.click();
		Thread.sleep(2000);
		driver.close();

	}

	public static void main(String ar[]) throws IOException, InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching Browser with below url
		driver.get(
				"file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/Dropdown_Input.html");

		WebElement Dropdown = driver.findElement(By.xpath(".//*[@id='browseroptions']"));
		Dropdown.click();

		// Taking list of Options from DropDown and selecting Option what we passed in
		// code
		List<WebElement> options = driver.findElements(By.xpath(".//*[@id='browseroptions']/option"));
		System.out.println(options.size());
		boolean flag = false;
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("chrome")) {
				flag = true;
				option.click();
				Dropdown.click();
			}
		}
		if (flag == false) {
			System.out.println(flag + " Given element not found");
		}
		Thread.sleep(2000);

		// It will close Browser window
		driver.close();
		
		Handling_DropDownUsingList.select2ndLastElement();
	}
}
