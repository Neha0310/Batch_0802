package Test_cases;
import Page_objects.Logout;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logout_test_case extends Logout {

	@BeforeSuite
	public void browserSetUp() throws IOException{
	browser_launch();
	loginWithValidCred();
	
	}
	
	@Test
	public void Logout_tc() 
	{
		logout();
		
	}
}
