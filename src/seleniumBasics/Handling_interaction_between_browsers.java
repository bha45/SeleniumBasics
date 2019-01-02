/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Handling_Interaction_between_Browsers {

	public static void main(String[] args) throws InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");

		// Driver instance is created
		WebDriver firefoxDriver = new FirefoxDriver();

		// To maximize Browser Window
		firefoxDriver.manage().window().maximize();

		// Launching the browser with the below url
		firefoxDriver.get("https://www.google.com");
		firefoxDriver.findElement(By.linkText("Gmail")).click();
		String text = firefoxDriver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h2")).getText();
		Thread.sleep(3000);

		// provide your path of driver location
		System.setProperty("webdriver.chrome.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");

		// Driver instance is created
		WebDriver chromeDriver = new ChromeDriver();

		// To maximize Browser Window
		chromeDriver.manage().window().maximize();

		// Launching the browser with the below url
		chromeDriver.get("http://www.gcrit.com/build3/create_account.php?osCsid=1vbg1oj32ole3qrcv4b6mr7m24");
		chromeDriver.findElement(By.name("firstname")).sendKeys(text);
		Thread.sleep(3000);

		// provide your path of driver location
		System.setProperty("webdriver.ie.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//IEdriver.exe");

		// Driver instance is created
		WebDriver IEDriver = new InternetExplorerDriver();

		// To maximize Browser Window
		IEDriver.manage().window().maximize();

		// Launching the browser with the below url
		IEDriver.get("https://in.mail.yahoo.com/");
		Thread.sleep(3000);

		// Closing all the browsers
		firefoxDriver.close();
		chromeDriver.close();
		IEDriver.close();

	}

}
