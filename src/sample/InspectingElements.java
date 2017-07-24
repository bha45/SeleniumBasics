package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectingElements 
{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		/*//Inspecting Element by id
		driver.findElement(By.id("Email")).sendKeys("jagathesh298");
		
		//Inspecting Element by name
		driver.findElement(By.name("Email")).sendKeys("jagathesh298");
		
		//Inspecting Element by cssSeletor
		driver.findElement(By.cssSelector("#Email")).sendKeys("jagathesh298");
		
		//Inspecting Element by Xpath
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("jagathesh298");
		driver.findElement(By.name("Email")).clear();*/
		
	//	driver.get("https://www.google.co.in/");
		
		//Inspecting Element by linkText
		//driver.findElement(By.linkText("Gmail")).click();
		
		//Inspecting Element by partialLinkText
		//driver.findElement(By.partialLinkText("mail")).click();
		
		//Inspecting Element by className
		//driver.findElement(By.className("gb_P")).click();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.tagName("input")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).clear();
		
		driver.close();
		
		/*WebElement jaga= driver.findElement(By.id("Email"));
		jaga.sendKeys("jagathesh298");
		Thread.sleep(3000);
		jaga.clear();
		Thread.sleep(3000);
		*/
		
	

	}

}
