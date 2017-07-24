package sample;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_dynamic_element {

	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.id("usernameId")).sendKeys("jaga5024");
		driver.findElement(By.className("loginPassword")).sendKeys("jpo894");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Captacha");
		String cap=scan.nextLine();
		
		driver.findElement(By.className("loginCaptcha")).sendKeys(cap);
		driver.findElement(By.id("loginbutton")).click();
		
		String url=driver.getCurrentUrl();
		
		if(url.equals("https://www.irctc.co.in/eticketing/home"))
		{
			System.out.println("Login Successful - Passed");
		}
		else
		{
			System.out.println("Login UnSuccessful - Failed");
		}
	
	}

}
