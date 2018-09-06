package advancedSeleniumFunctions;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_BrokenImages {

	public static WebDriver driver;
	public static int invalidImages = 0;

	public static void main(String ar[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(5000);

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Images : " + images.size());

		for (WebElement image : images) {
			if (image != null) {
				verifyImage(image);
			}

		}
		System.out.println("Broken Images Count : " + invalidImages);
		driver.close();
	}

	public static void verifyImage(WebElement image) {
		try {

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(image.getAttribute("src"));
			HttpResponse response = client.execute(request);

			if (response.getStatusLine().getStatusCode() != 200) {
				invalidImages++;
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
