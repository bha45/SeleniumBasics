package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Admin_login_positive 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();

		String url = driver.getCurrentUrl();

		if (url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
		System.out.println("Admin Login Successful - Passed");
		}
		else 
		{
		System.out.println("Admin Login Unsuccessful - Failed");
		}
		
		driver.close();

		
	}

}
