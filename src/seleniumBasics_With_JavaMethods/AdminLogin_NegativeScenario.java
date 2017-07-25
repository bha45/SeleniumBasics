package seleniumBasics_With_JavaMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin_NegativeScenario {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admina");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();

		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/admin/login.php"))
		{
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

		if (ErrorMessage.contains("Invalid administrator login attempt."))
		{
		System.out.println("Handling Invalid Inputs - Passed");
		}
		}
		else 
		{
		System.out.println("Not Handling Invalid Inputs - Failed");
		}
		Thread.sleep(3000);
		//driver.close();


	}

}
