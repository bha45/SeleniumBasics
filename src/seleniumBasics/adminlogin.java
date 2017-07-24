package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adminlogin {

	/**
	 * @param args
	 */
	static WebDriverWait wait;
	public static void main(String[] args) 
	{
		
		/*System.setProperty("webdriver.chrome.driver","E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		*/
		//System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//wires.exe");
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");*/
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@12");
		//driver.findElement(By.id("tdb1")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("tdb1")));
		driver.findElement(By.id("tdb1")).click();
		
		
        String url=driver.getCurrentUrl();
        System.out.println(url);
        
		if(url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
		System.out.println("passed");
		}
		else
		{
		System.out.println("failed");
		}

	driver.close();
	}
	
}
