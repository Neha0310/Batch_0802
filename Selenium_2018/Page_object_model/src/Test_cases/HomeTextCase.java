package Test_cases;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_objects.HomePage;
public class HomeTextCase extends HomePage {

	@Test
	public void verifyHomePageTC() 
	{
		String ExpVal="Dashboard";
		String actualVal=verifyHomePage();
		System.out.println(actualVal);
		Assert.assertEquals(actualVal,ExpVal);
	}
	

}
