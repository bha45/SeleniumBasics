package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exception_handling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
		/*if(driver.findElement(By.linkText("Gmaila")).isDisplayed())
		{
			System.out.println("Gmail Link Exist - Passed");
		}
	    else
		{
			System.out.println("Gmail Link Exist - Failed");
		}
	*/
	try
	{

		if(driver.findElement(By.linkText("Gmaila")).isDisplayed())
		{
			System.out.println("Gmail Link Exist - Passed");
		}
	}
	
		catch(NoSuchElementException e)
		{
			System.out.println("Gmail Link Exist - Failed");
		}
	}

}
