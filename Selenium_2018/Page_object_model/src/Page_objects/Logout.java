package Page_objects;
import Utility.Common_functions;
import Page_objects.Login_page;
public class Logout extends Common_functions{
	
		public void loginWithValidCred() 
		{
			senddata("id", "txtUsername", "Admin");
			senddata("id","txtPassword","admin123");
			clickElm("id","btnLogin");
			
		}
	public void logout() 
	{
		logout_chk();
	}

}
