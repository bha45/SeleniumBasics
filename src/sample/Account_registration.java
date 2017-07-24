package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Account_registration {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gcrit.com/build3/");
		
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("jaga");
		driver.findElement(By.name("lastname")).sendKeys("waran");
		driver.findElement(By.name("dob")).sendKeys("08/29/1994");
		driver.findElement(By.name("email_address")).sendKeys("jagathesh298@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("TamilNadu");
		driver.findElement(By.name("postcode")).sendKeys("600001");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("India");
		
		driver.findElement(By.name("telephone")).sendKeys("9944556612");
		driver.findElement(By.name("password")).sendKeys("jaga1994");
		driver.findElement(By.name("confirmation")).sendKeys("jaga1994");
		driver.findElement(By.id("tdb4")).click();
		
		String ConformationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();

		if (ConformationMessage.equals("Your Account Has Been Created!"))
		{
		System.out.println("Customer Registration Successful - Passed");	
		}
		else
		{
		System.out.println("Customer Registration Unsuccessful - Failed");	
		}
		
		driver.close();

	}

}
