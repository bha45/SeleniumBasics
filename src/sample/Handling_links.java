package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_links {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		/*//class Name
		driver.findElement(By.className("gb_P")).click();
		//link text
		driver.findElement(By.linkText("Gmail")).click();
		//partial link text
		driver.findElement(By.partialLinkText("Gma")).click();
		*/
		WebElement mail= driver.findElement(By.linkText("Gmail"));
		mail.click();
		boolean mstatus=mail.isDisplayed();
		System.out.println(mstatus);
		

	}

}
