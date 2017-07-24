package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_mover {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.carmax.com/");
		Actions builder=new Actions(driver);
		WebElement menu=driver.findElement(By.linkText("Sell Your Car"));
		builder.moveToElement(menu).build().perform();
		driver.findElement(By.linkText("Determining Your Offer")).click();
		
	
		
	}

}
