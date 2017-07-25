package seleniumBasics_With_JavaMethods;

public class AdminLogin_PositiveScenario_Userdefined extends AdminLogin_Userdefinedmethods
{

	public static void main(String[] args) 
	{
		
		AdminLogin_PositiveScenario_Userdefined obj2 = new AdminLogin_PositiveScenario_Userdefined();
		
		obj2.launchBrowser();
		obj2.adminLogin();
		
		String url = driver.getCurrentUrl();

		if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
		{
		System.out.println("Admin Login Successful - Passed");	
		}
		else 
		{
		System.out.println("Admin Login Unsuccessful - Failed");	
		}
		obj2.closeBrowser();
	}

}
