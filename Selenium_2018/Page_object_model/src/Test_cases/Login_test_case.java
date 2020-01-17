 package Test_cases;
import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page_objects.Login_page;

public class Login_test_case extends Login_page {

	
		@BeforeSuite
		public void browserSetUp() throws IOException{
		browser_launch();
		}
		
		@Test
		public void chkLoginFunc() 
		{
			loginWithValidCred();
		}

	

}
