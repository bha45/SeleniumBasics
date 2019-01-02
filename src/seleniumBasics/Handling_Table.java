/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_Table {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("file:///E:/ECLIPSE%20ENV/Selenium_Excercises/SeleniumBasics/TestResources/Tables.html");
		WebElement html = driver.findElement(By.xpath("html/body/table"));
		String val = driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(val);

		// The below line will get the number of rows in a table and store it in List
		List<WebElement> rows = html.findElements(By.tagName("tr"));
		int r = rows.size();
		System.out.println(r);

		// The below line will get the number of cells in a table and store it in List
		List<WebElement> cels = html.findElements(By.tagName("td"));
		int c = cels.size();
		System.out.println(c);

		// It will close the Browser window
		driver.close();
	}

}
