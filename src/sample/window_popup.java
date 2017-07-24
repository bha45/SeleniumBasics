package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class window_popup {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.rediffmail.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alertobj=driver.switchTo().alert();
		String error=alertobj.getText();
		System.out.println(error);
		alertobj.accept();
	
		
		
	}

}
