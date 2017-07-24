package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customer_login {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("jagathesh298@gmail.com");
		driver.findElement(By.name("password")).sendKeys("jaga1994");
		driver.findElement(By.id("tdb5")).click();
		
		String url = driver.getCurrentUrl();
		//System.out.println(url);

		if (url.contains("http://www.gcrit.com/build3/index.php"))
		{
		System.out.println("Login Successful - Passed");
		}
		else
		{
		System.out.println("Login Unsuccessful - Failed");
		}
		driver.close();

	}

}
