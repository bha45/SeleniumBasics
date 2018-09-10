package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Coordinates {
	
	public static void main(String ar[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Point point = driver.manage().window().getPosition();
		System.out.println("X coordinate of Screen "+point.getX());
		System.out.println("Y coordinate of Screen "+point.getY());
		Thread.sleep(2000);
	
		driver.manage().window().maximize();
		
		Point point1 = driver.manage().window().getPosition();
		System.out.println("X coordinate of Screen "+point1.getX());
		System.out.println("Y coordinate of Screen "+point1.getY());
		Thread.sleep(2000);
		
		Point pointElement = driver.findElement(By.xpath("//*[@name='btnK']")).getLocation();
		System.out.println("X coordinate of GoogleSearchBtn "+pointElement.getX());
		System.out.println("Y coordinate of GoogleSearchBtn "+pointElement.getY());
		Thread.sleep(2000);
		
		driver.close();
	}

}
