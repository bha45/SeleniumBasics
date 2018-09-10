package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_TextBoxSize {

	public static void main(String ar[]) {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		int googleSearchBtnWidth = driver.findElement(By.xpath("//*[@name='btnK']")).getSize().getWidth();
		System.out.println("Width of googleSearchBtn : " + googleSearchBtnWidth);
		int googleSearchBtnHeight = driver.findElement(By.xpath("//*[@name='btnK']")).getSize().getHeight();
		System.out.println("Height of googleSearchBtn : " + googleSearchBtnHeight);

		driver.close();
	}

}
