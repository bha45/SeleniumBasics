/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Handling_CaptureFullPageScreenShotByAShot {

	static WebDriver driver;

	public static void main(String jaga[]) throws Exception {

		// Provide path of the driver
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance created
		driver = new ChromeDriver();

		// Maximize Browser window
		driver.manage().window().maximize();

		// Launch below URL
		driver.get("https://www.seleniumhq.org/download/");
		takeFullScreen("./SreenShots/" + System.currentTimeMillis() + ".jpg");

		// It will close Browser window
		driver.close();
	}

	public static void takeFullScreen(String filepath) throws IOException {

		try {

			// It will be used to store the captured screenshot
			File destination = new File(filepath);

			// Capturing Full Page Screen using AShot by passing driver instance
			Screenshot screenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);

			// Writing the capture image to destination location
			ImageIO.write(screenShot.getImage(), "JPG", destination);
			System.out.println("capture success!");
			
		} catch (IOException e) {
			
			filepath = null;
			throw new RuntimeException(e);
		}
	}

}
