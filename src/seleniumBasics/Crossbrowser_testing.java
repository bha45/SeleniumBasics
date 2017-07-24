package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Crossbrowser_testing {

	// Declaring all the global variables
	public static WebDriver driver;
	public static String browsername;
	public static int browser;

	public static void main(String[] args) {

		for (int browser = 1; browser <= 3; browser++) {

			if (browser == 1) {

				browsername = "FireFox";
				// provide your path of driver location
				System.setProperty("webdriver.firefox.marionette", "E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
				// Driver instance is created
				driver = new FirefoxDriver();
			} else if (browser == 2) {

				browsername = "Chrome";
				// provide your path of driver location
				System.setProperty("webdriver.chrome.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");
				// Driver instance is created
				driver = new ChromeDriver();
			} else if (browser == 3) {

				browsername = "Internet Explorer";
				// provide your path of driver location
				System.setProperty("webdriver.ie.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//IEdriver.exe");
				// Driver instance is created
				driver = new InternetExplorerDriver();
			}

			// Launching the selected browser with the below url
			driver.get("https://www.google.co.in");

			// Capturing the Current page title
			String title = driver.getTitle();

			// Verifing the Captured Title
			if (title.equals("Google")) {
				System.out.println(browsername + " " + "Google Appliction Lunched-Passed");
			} else {
				System.out.println(browsername + " " + "Google Appliction Lunched-Fialed");
			}
			driver.close();
		}

	}
}
