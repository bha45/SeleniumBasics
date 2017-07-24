package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Table {

	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///E:/ECLIPSE%20ENV/SELENIUM%20LIBS/Tables.html");
		WebElement html=driver.findElement(By.xpath("html/body/table"));
	    String val=	driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(val);
		
		List<WebElement> rows=html.findElements(By.tagName("tr"));
		int r=rows.size();
		System.out.println(r);
		
		List<WebElement> cels=html.findElements(By.tagName("td"));
		int c=cels.size();
		System.out.println(c);
		
		
	}

}
