package TestNGtests;

import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample 
{

	@Test
	public void VerifyTitle()
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Gmail");
	}
	
	
}
