package TestNGtests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	
	public class Ajax 
	{
		
	private String ajaxTestSite = "http://www.w3schools.com/ajax/tryit.asp?filename=tryajax_callback";
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void startTest() 
	{
	// Launch the demo web page to handle AJAX calls using Webdriver.
	System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to(ajaxTestSite);
	}
	
	@Test
	public void test_AjaxCalls() 
	{
		
	/* Wait for the AJAX controls to appear. */
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	By container = By.xpath(".//*[@id='demo']");
	wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.presenceOfElementLocated(container));
	
	/* Read the text that appears in the AJAX text control. */
	WebElement ajaxControl = driver.findElement(container);
	String ajaxTextFirstPara = ajaxControl.getText().trim();
	
	/* Click on the AJAX button control. */
	driver.findElement(By.xpath("html/body/button")).click();
	
	/* Wait for the new content to appear in the AJAX text control. */
	By newAjaxcontrol = By.xpath(".//*[@id='demo']/p");
	Wait<WebDriver> newwait = new FluentWait<>(driver)
	.withTimeout(60, TimeUnit.SECONDS)
	.pollingEvery(5, TimeUnit.SECONDS)
	.ignoring(NoSuchElementException.class);
	newwait.until(ExpectedConditions
	.presenceOfElementLocated(newAjaxcontrol));
	
	/*
	* Wait for the second paragraph value to get visible in the AJAX text
	* control.
	*/
	
	WebElement secondParagraph = driver.findElement(By
	.xpath(".//*[@id='demo']/p[2]"));
	wait.until(ExpectedConditions.visibilityOf(secondParagraph));
	
	/* Get the text from the first paragraph after the AJAX call. */
	String ajaxNewTextFirstPara = driver
	.findElement(By.xpath(".//*[@id='demo']/p[1]")).getText()
	.trim();
	
	/* Get the text from the second paragraph after the AJAX call. */
	String ajaxTextSecondPara = secondParagraph.getText().trim();
	String expectedTextInSecondPara = "AJAX is a technique for creating fast and dynamic web pages.";
	
	/* Verify the first paragraph text shouldn't match the new text. */
	Assert.assertNotEquals(ajaxTextFirstPara, ajaxNewTextFirstPara);
	
	/* Verify the second paragraph text must match with the new text. */
	Assert.assertEquals(ajaxTextSecondPara, expectedTextInSecondPara);
	}
	
	@AfterTest
	public void endTest() 
	{
	driver.quit();
	}
	}


