package testNG_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority 
{
	public WebDriver driver;
	
	@Test (priority=1)
	public void launchBrowser()
	{
	System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
    driver = new FirefoxDriver();   
	}

	@Test (priority=2)
	public void verifyPageTitle1()
	{
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail", driver.getTitle());
	}

	@Test(priority=3)
	public void verifyPageTitle2()
	{
	driver.get("https://in.yahoo.com/");
	Assert.assertEquals("Yahoo", driver.getTitle());
	}
	@Test (priority=4)
	public void closeBrowser()
	{
	driver.close();
	}
	
}
