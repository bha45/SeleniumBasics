/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_BrowserNavigationMethods {

	public static void main(String[] args) {
		
		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();
		
		//To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("https://www.google.co.in");

		String url = driver.getCurrentUrl();
		System.out.println(url);

		// navigate.to - It will navigate to the Yahoo page from Google home page
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

		// driver close - It will close the current browser window
		driver.close();
	}

}