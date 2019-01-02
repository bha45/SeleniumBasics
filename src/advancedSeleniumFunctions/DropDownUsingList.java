package advancedSeleniumFunctions;
import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownUsingList {

	static WebDriver driver;

	public static void select2ndLastElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/Dropdown_Input.html");
		WebElement Dropdown = driver.findElement(By.xpath(".//*[@id='browseroptions']"));
		Dropdown.click();
		List<WebElement> options = driver.findElements(By.xpath(".//*[@id='browseroptions']/option"));
		System.out.println(options.size());
		Thread.sleep(2000);
		WebElement option = options.get(options.size() - 2);
		option.click();
		Dropdown.click();
		Thread.sleep(2000);
		driver.close();

	}

	public static void main(String ar[]) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/Dropdown_Input.html");

		WebElement Dropdown = driver.findElement(By.xpath(".//*[@id='browseroptions']"));
		Dropdown.click();
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
		driver.close();
		DropDownUsingList.select2ndLastElement();
	}
}
