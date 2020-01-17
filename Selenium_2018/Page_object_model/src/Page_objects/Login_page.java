package Page_objects;
import Utility.Common_functions;
public class Login_page extends Common_functions {

	
	public void loginWithValidCred() 
	{
		senddata("id", "txtUsername", "Admin");
		senddata("id","txtPassword","admin123");
		clickElm("id","btnLogin");
		
	}
	
	

}
