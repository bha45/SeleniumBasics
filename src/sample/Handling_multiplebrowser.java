package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_multiplebrowser {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("file:///E:/ECLIPSE%20ENV/SELENIUM%20LIBS/Login.html");
		driver.findElement(By.linkText("Sign Up")).click();
		
		String parent = driver.getWindowHandle();
		
		Set <String> handles=driver.getWindowHandles();
		int BrowserCount=handles.size();
		System.out.println(BrowserCount);
		
		//TO change focus to Second Window
		for(String s1:handles)
		{
			if(! s1.equals(parent))
			{
			driver.switchTo().window(s1);
			System.out.println(driver.getCurrentUrl());
			driver.close();
			}
		}
		
		
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());

	}

}
