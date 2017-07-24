package sample;

//import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getmethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//get 
        driver.get("https://www.google.co.in");
       
        //get page source
        String pagesource=driver.getPageSource();
        System.out.println(pagesource);
       
        // get curl
        String url=driver.getCurrentUrl();
        System.out.println(url);
	    
        //get title
        String var=driver.getTitle();
        System.out.println(var);
        
        //get window handle
        String window=driver.getWindowHandle();
        System.out.println(window);
        
	}
	
}
		