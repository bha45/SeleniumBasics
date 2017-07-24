package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Admin_login_Userdefinedmethods 
{

	 public static WebDriver driver;
		
		//Launch Browser
		public void launchBrowser()
		{
		//provide your path of driver location
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		//Driver instance is created
		driver = new FirefoxDriver();	
		}
		
		//Admin Login without Parameters
		public void adminLogin()
		{
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		}
		
		//Admin Login With Parameters
		public void adminLogin(String username, String password)
		{
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		}
		
		//Close Browser
		public void closeBrowser()
		{
		if (! driver.toString().contains("null"))
		{
		driver.close();
		}
		}
		
		public static void main(String[] args) 
		{
		Admin_login_Userdefinedmethods obj = new Admin_login_Userdefinedmethods();
		obj.launchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		obj.launchBrowser();
		obj.adminLogin("admin", "admin@123");
		obj.closeBrowser();

	}

}
