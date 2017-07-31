/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Radiobutton_Dropdown {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();
		
		// The method will maximize the browser window
		driver.manage().window().maximize();

		// Radio button
		// Launching the browser with the below url
		driver.get("http://www.gcrit.com/build3/create_account.php");

		// The below lines will navigate to below url and check radio button presence and click it
		WebElement mradio = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		boolean status = mradio.isDisplayed();
		System.out.println(status);
		System.out.println(mradio.isEnabled());
		mradio.click();
		System.out.println(mradio.isSelected());

		// Drop down box
		// Launching the browser with the below url
		driver.get("http://www.gcrit.com/build3/create_account.php");

		// The Select class will used to handle the dropdown
		// The dropdown values will be selected by index,visibleText,and value
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByIndex(5);
		dropdown.selectByVisibleText("India");

		// The list will get all the values of dropdown and stores it
		List<WebElement> obj = dropdown.getOptions();
		int total = obj.size();
		System.out.println(total);

	}
}