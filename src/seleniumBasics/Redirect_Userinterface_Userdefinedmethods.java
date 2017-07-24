package seleniumBasics;

import org.openqa.selenium.By;

public class Redirect_Userinterface_Userdefinedmethods extends Admin_login_Userdefinedmethods
{

	public static void main(String[] args) 
	{
		Redirect_Userinterface_Userdefinedmethods object = new Redirect_Userinterface_Userdefinedmethods();
		
		object.launchBrowser();
		object.adminLogin("admin","admin@123");
		
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();

		if (url.equals("http://www.gcrit.com/build3/"))
		{
		System.out.println("Redirected to User Interface -Passed");	
		}
		else 
		{
		System.out.println("Redirected to User Interface -Failed");	
		}
		object.closeBrowser();

	}

}
