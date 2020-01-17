package Page_objects;

import Utility.Common_functions;

public class HomePage extends Common_functions {

	public String verifyHomePage() 
	{
		String textVal = null;
 
		boolean res = chkElm_present("xpath", "//h1[text()='Dashboard']");
		if (res) {
			 
			textVal = getElm_Text("xpath", "//h1[text()='Dashboard']");
		}
		 
		return textVal;

	}

}
