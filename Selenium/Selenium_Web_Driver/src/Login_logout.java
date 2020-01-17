import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_logout {

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

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.xpath("//div[@id='welcome-menu']//li//a[@href='/index.php/auth/logout']")).click();
		
		

	}

}
