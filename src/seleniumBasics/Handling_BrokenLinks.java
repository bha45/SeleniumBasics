/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_BrokenLinks {

	// Declaring the Global variables
	static WebDriver driver;

	public static void main(String ar[]) throws IOException, InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(5000);

		// Taking list of links in the Page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links : " + links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement element = links.get(i);

			String url = element.getAttribute("href");

			verifyUrlLink(url);

		}

		// driver close - It will close the current browser window
		driver.close();
	}

	// The below method verifies whether URL is an Valid URL or Broken URL
	public static void verifyUrlLink(String url) throws IOException {

		try {

			URL urlLink = new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection) urlLink.openConnection();

			httpConn.setConnectTimeout(5000);
			httpConn.connect();

			if (httpConn.getResponseCode() == 200) {
				System.out.println("200 Status Url Link : " + httpConn.getResponseMessage());
			} else if (httpConn.getResponseCode() == 404) {
				System.out.println("404 Status Url Link : " + httpConn.getResponseMessage());
			}

		} catch (MalformedURLException e) {

			System.out.println(e.getMessage());
		}

	}

}
