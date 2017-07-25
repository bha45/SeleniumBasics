package testNG_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforemethod_Aftermethod 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
	System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
	driver = new FirefoxDriver();   
	}

	@Test
	public void verifyPageTitle1(){
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail", driver.getTitle());
	}

	@Test
	public void verifyPageTitle2(){
	driver.get("https://in.yahoo.com/");
	Assert.assertEquals("Yahoo", driver.getTitle());
	}
	
	@AfterMethod
	public void closeBrowser(){
	driver.close();
	}

}
