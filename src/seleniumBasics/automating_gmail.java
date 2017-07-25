package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automating_Gmail {

	public static void main(String[] args) throws InterruptedException {
		
		// provide your path of driver location
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");
		
		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// Launching the browser with the below url to open Gmail
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");

		// Automating the Gmail login using WebElement
		// For Username and Password provide valid data
		WebElement jaga = driver.findElement(By.id("Email"));
		jaga.sendKeys("testjaga001");
		WebElement jaga1 = driver.findElement(By.id("next"));
		jaga1.click();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#password");
		WebElement jaga2 = driver.findElement(By.id("Passwd"));
		jaga2.sendKeys("jaga@12345");
		WebElement jaga3 = driver.findElement(By.id("signIn"));
		jaga3.click();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(3000);
		WebElement jaga4 = driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		jaga4.click();
		WebElement jaga5 = driver.findElement(By.xpath("//*[@id='gb_71']"));
		jaga5.click();

		// Automating the Gmail login
		// For Username and Password provide valid data
		driver.findElement(By.name("Email")).sendKeys("testjaga001");
		driver.findElement(By.id("next")).click();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#password");
		driver.findElement(By.name("Passwd")).sendKeys("jaga@12345");
		driver.findElement(By.id("signIn")).click();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();

	}

}
