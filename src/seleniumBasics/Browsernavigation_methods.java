package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsernavigation_methods {

	public static void main(String[] args) {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");

		// Driver instance is created
		WebDriver driver = new FirefoxDriver();

		// Launching the browser with the below url
		driver.get("https://www.google.co.in");

		String url = driver.getCurrentUrl();
		System.out.println(url);

		// navigate.to - It will navigate to the Yahoo page from Google home
		// page
		driver.navigate().to("https://in.yahoo.com/");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);

		// navigate.back - It will navigate back to the Google home page
		driver.navigate().back();
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);

		// navigate.forward - It will navigate forward to the Yahoo page
		driver.navigate().forward();
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);

		// navigate.refresh - It will refresh the Current page
		driver.navigate().refresh();
		String url4 = driver.getCurrentUrl();
		System.out.println(url4);

		// driver close
		driver.close();
	}

}