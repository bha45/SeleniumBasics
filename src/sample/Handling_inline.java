package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_inline 
{

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();
		
		//for more link
	    driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='gb300']/span[1]")).click();
		
		

	}

}
