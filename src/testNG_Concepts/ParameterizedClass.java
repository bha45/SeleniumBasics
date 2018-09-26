package testNG_Concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedClass {
	
	@Test
	@Parameters("name")
	public void user(String name) {
		System.out.println("The user name from testNG.xml is : " +name);
	}

}
