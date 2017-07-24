package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Handling_interaction_between_browsers {

	public static void main(String[] args) throws InterruptedException {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");

		// Driver instance is created
		WebDriver firefoxDriver = new FirefoxDriver();

		// Launching the browser with the below url
		firefoxDriver.get("https://www.google.com");
		firefoxDriver.findElement(By.linkText("Gmail")).click();
		String text = firefoxDriver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h2")).getText();
		Thread.sleep(3000);

		// provide your path of driver location
		System.setProperty("webdriver.chrome.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");

		// Driver instance is created
		WebDriver chromeDriver = new ChromeDriver();

		// Launching the browser with the below url
		chromeDriver.get("http://www.gcrit.com/build3/create_account.php?osCsid=1vbg1oj32ole3qrcv4b6mr7m24");
		chromeDriver.findElement(By.name("firstname")).sendKeys(text);
		Thread.sleep(3000);

		// provide your path of driver location
		System.setProperty("webdriver.ie.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//IEdriver.exe");

		// Driver instance is created
		WebDriver IEDriver = new InternetExplorerDriver();

		// Launching the browser with the below url
		IEDriver.get("https://in.mail.yahoo.com/");
		Thread.sleep(3000);

		// Closing all the browsers
		firefoxDriver.close();
		chromeDriver.close();
		IEDriver.close();

	}

}
