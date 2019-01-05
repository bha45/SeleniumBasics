/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_Image {

	public static void main(String[] args) {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching the browser with the below url
		driver.get("https://www.google.co.in");

		// This line will check the presence of image
		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));

		// This line will navigate the below url and click image button
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();

		// This line will navigate the below url and click image link
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
		
		// It will close the Browser window
		driver.close();

	}

}
