package sample;

public class Admin_login_pos_userdefined extends Admin_login_Userdefinedmethods
{

	public static void main(String[] args) 
	{
		
		Admin_login_pos_userdefined obj2 = new Admin_login_pos_userdefined();
		
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
