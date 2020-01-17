import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Login {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		//System.out.println(javaVersion);
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		
		//Launch the browser
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.close();//close current window
		//driver.quit();//close all windows
		//to launch url
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//to maximize window
		driver.manage().window().maximize();
		//to click browser back button
		//driver.navigate().back();
		//to click browser forward button
		//driver.navigate().forward();
		//to verify title of an application.
		String expected_title="OrangeHRM";
		String actual_title=driver.getTitle();
		if(expected_title.equalsIgnoreCase(actual_title)) 
		{
			System.out.println("Title matched");
		}
		else 
		{
			System.out.println("Not matched");
		}
//to get url
		String s=driver.getCurrentUrl();
		System.out.println(s);
	}

}
