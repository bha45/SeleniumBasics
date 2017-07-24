package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsernavigation {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//navigate.to
		driver.navigate().to("https://in.yahoo.com/");
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		//navigate.back
		driver.navigate().back();
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		
		//navigate.forward
		driver.navigate().forward();
		String url3=driver.getCurrentUrl();
		System.out.println(url3);
		
		//navigate.refresh
		driver.navigate().refresh();
		String url4=driver.getCurrentUrl();
		System.out.println(url4);
		
		//driver close
		driver.close();
	}

}