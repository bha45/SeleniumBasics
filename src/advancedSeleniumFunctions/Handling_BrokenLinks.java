package advancedSeleniumFunctions;

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

	static WebDriver driver;

	public static void main(String ar[]) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(5000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links : "+links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement element = links.get(i);

			String url = element.getAttribute("href");

			verifyUrlLink(url);

		}

		driver.close();
	}

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
