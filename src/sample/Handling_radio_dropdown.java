package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_radio_dropdown {

	
	public static void main(String[] args) 
	{
		Handling_radio_dropdown j = new Handling_radio_dropdown();
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	/*	//radio button
		driver.get("http://www.gcrit.com/build3/create_account.php");
		WebElement mradio=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		boolean status=mradio.isDisplayed();
		System.out.println(status);
		System.out.println(mradio.isEnabled());
		mradio.click();
		System.out.println(mradio.isSelected());
*/
		//drop down box
		driver.get("http://www.gcrit.com/build3/create_account.php");
		
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByIndex(5);
		dropdown.selectByVisibleText("India");
		List<WebElement> obj=dropdown.getOptions();
		int total=obj.size();
		System.out.println(total);
		
		
		
		
}}