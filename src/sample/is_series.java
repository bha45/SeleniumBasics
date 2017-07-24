package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class is_series {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		
		//window maximize
		driver.manage().window().maximize();
		
		//is Enabled
		boolean a=driver.findElement(By.id("next")).isEnabled();
		System.out.println(a);
		
		//is Enabled
		boolean b=driver.findElement(By.id("next")).isDisplayed();
		System.out.println(b);
		
		driver.get("file:///E:/ECLIPSE%20ENV/SELENIUM%20LIBS/checkbox.html");
		//is Selected
		boolean c=driver.findElement(By.name("option2")).isSelected();
		System.out.println(c);
		

	}

}
