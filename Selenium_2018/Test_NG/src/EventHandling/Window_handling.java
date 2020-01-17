package EventHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Window_handling {
	WebDriver driver;
	@BeforeClass
	public void browser_launch() {
	String driverPath = System.getProperty("user.dir") + "\\src\\Browser_drivers\\chromedriver_2.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	
	
	}
	@Test
	public void windowHandling() 
	{
		//for parent window
		String st=driver.getWindowHandle();
		System.out.println("parent window:- "+st);
		
		//all child windows
		Set allWds=driver.getWindowHandles();
		System.out.println("Child windows:- "+allWds);
		allWds.remove(st);
		Iterator itr=allWds.iterator();
		while(itr.hasNext()) 
		{
			String windId=itr.next().toString();
			driver.switchTo().window(windId);
			String title=driver.getTitle();
			System.out.println("Title of the window:- "+title);
		}
	}


}
