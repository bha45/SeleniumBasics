package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_editbox_textarea_errormsg {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	    //Edit box
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("jaga");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).clear();
		System.out.println(driver.findElement(By.id("Email")).getAttribute("type"));
		
		
		//Using WebElement
		driver.get("https://www.gmail.com");
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("jaga");
		email.clear();
	    // Problem- String s=email.getText();
		System.out.println(email.isDisplayed());
		System.out.println(email.isEnabled());
		
		
		//Text Area
		driver.get("https://www.gmail.com");
		String text= driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1")).getText();
		System.out.println(text);
		
		
		//Error Message
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath(".//*[@id='login-signin']s")).click();
		String error=driver.findElement(By.id("mbr-login-error")).getText();
		System.out.println(error);
		
		
		
	
		
		
	}

}
