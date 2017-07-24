package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_images {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
		
		
		
	}

}
