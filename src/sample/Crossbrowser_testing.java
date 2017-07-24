package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Crossbrowser_testing 
{
	/*public static WebDriver driver;
	public static int browser;
	public static String BrowserName;

	public static void main(String[] args) {

	for (browser = 1; browser <= 3; browser++){
	if (browser == 1) {
	System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
	driver = new FirefoxDriver();
	BrowserName = "Mozilla Firefox Browser: ";
	}
	else if (browser == 2) {
	System.setProperty("webdriver.chrome.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");
	driver = new ChromeDriver();
	BrowserName = "Google Chrome Browser: ";
	}
	else if (browser == 3){
	System.setProperty("webdriver.ie.driver", "E:/ECLIPSE ENV//SELENIUM LIBS//IEdriver.exe");
	driver = new InternetExplorerDriver();
	BrowserName = "Internet Explorer Browser: ";
	}
	driver.get("https://www.google.com");

	String PageTitle = driver.getTitle();

	if (PageTitle.equals("Google")){
	System.out.println(BrowserName + " - Google Application Launched - Passed");
	}
	else {
	System.out.println(BrowserName + " - Google Application Not Launched -Failed");	
	}
	driver.close();
	}
	}
*/




	public static WebDriver driver;
	public static String browsername;
	public static int browser;
	
	
	public static void main(String[] args) 
	{
		for(int browser=1;browser<=3;browser++)
		{
			if(browser==1)
			{
				browsername="FireFox";
				System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browser==2)
			{
				browsername="Chrome";
				System.setProperty("webdriver.chrome.driver","E:/ECLIPSE ENV//SELENIUM LIBS//chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser==3)
			{
				browsername="Internet Explorer";
				System.setProperty("webdriver.ie.driver","E:/ECLIPSE ENV//SELENIUM LIBS//IEdriver.exe");
				driver=new InternetExplorerDriver();
			}
		
			driver.get("https://www.google.co.in");
			
			String title=driver.getTitle();
			
			if(title.equals("Google"))
			{
				System.out.println(browsername+" "+"Google Appliction Lunched-Passed");
			}
			else
			{
				System.out.println(browsername+" "+"Google Appliction Lunched-Fialed");
			}
			driver.close();
		}
		
	}
}

