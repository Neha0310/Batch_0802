import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_method {

	public static void main(String[] args)
	{
		String driver_path=System.getProperty("user.dir")+"//src//Browser_drivers//chromedriver.exe";
		//System.out.println(driver_path);
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("pwd");
		driver.findElement(By.id("txtUsername")).clear();
		boolean disp=driver.findElement(By.id("logInPanelHeading"))
				.isDisplayed();
		System.out.println(disp);

	}

}
