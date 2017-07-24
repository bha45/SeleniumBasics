package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automating_gmail 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		
		
		//Automating the Email login of jagathesh298 using WebElement
				/*WebElement jaga= driver.findElement(By.id("Email"));
				jaga.sendKeys("jagathesh298");
				WebElement jaga1= driver.findElement(By.id("next"));
				jaga1.click();
				driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#password");
				WebElement jaga2= driver.findElement(By.id("Passwd"));
				jaga2.sendKeys("jagajack93");
				WebElement jaga3= driver.findElement(By.id("signIn"));
				jaga3.click();
				driver.get("https://mail.google.com/mail/u/0/#inbox");
				Thread.sleep(3000);
				WebElement jaga4= driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
				jaga4.click();
				WebElement jaga5= driver.findElement(By.xpath("//*[@id='gb_71']"));
				jaga5.click();
				*/
	    //Automating the Email login of jagathesh298 using 
				driver.findElement(By.name("Email")).sendKeys("jagathesh298");
				driver.findElement(By.id("next")).click();
				driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#password");
				driver.findElement(By.name("Passwd")).sendKeys("jagajack93");
				driver.findElement(By.id("signIn")).click();
				driver.get("https://mail.google.com/mail/u/0/#inbox");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
				driver.findElement(By.xpath("//*[@id='gb_71']")).click();

	}

}
