package EventHandling;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IFrameHandling {
	WebDriver driver;
		@BeforeClass
		public void browser_launch() {
		String driverPath = System.getProperty("user.dir") + "\\src\\Browser_drivers\\chromedriver_2.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("file:///E:/sdet_training/Template/template_7/iFrames.html");
		
		}
		@Test
		public void iframeHandling()  
		{
			driver.switchTo().frame(0);
			driver.findElement(By.id("name")).sendKeys("Neha");
			driver.findElement(By.id("mail")).sendKeys("neha@gmail.com");
			driver.switchTo().defaultContent();
			//by using name
			driver.switchTo().frame("IF2");
			driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
			
			//By using web element
			
			//WebElement elm=driver.findElement(By.xpath("//iframe[contains(@src,'iframe_alerts_data.html')]"));
			//driver.switchTo().frame(elm);
			//driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
			
		}
		
}
