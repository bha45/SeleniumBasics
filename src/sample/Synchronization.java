package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Synchronization 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//Unconditional Synchronization
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();

		
		//Conditional Synchronization
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail")).click();


	}

}
