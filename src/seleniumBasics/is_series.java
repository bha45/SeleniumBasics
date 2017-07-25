package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_series {

	public static void main(String[] args) {

		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// Launching the browser with the below url
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");

		// The below method will maximize the browser window
		driver.manage().window().maximize();

		// is Enabled - It will check whether the Web element is enabled
		boolean a = driver.findElement(By.id("next")).isEnabled();
		System.out.println(a);

		// is Displayed - It will check whether the Web element is displayed
		boolean b = driver.findElement(By.id("next")).isDisplayed();
		System.out.println(b);

		// Launching the browser with the below url
		driver.get("file:///E:/ECLIPSE%20ENV/SELENIUM%20LIBS/checkbox.html");

		// is Selected - It will check whether the Web element is selected
		boolean c = driver.findElement(By.name("option2")).isSelected();
		System.out.println(c);

	}

}
