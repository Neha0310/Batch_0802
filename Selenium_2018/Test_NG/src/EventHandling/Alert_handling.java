package EventHandling;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alert_handling {
	WebDriver driver;
		@BeforeClass
		public void browser_launch() {
		String driverPath = System.getProperty("user.dir") + "\\src\\Browser_drivers\\chromedriver_2.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("file:///E:/sdet_training/Template/template_7/alerts.html");
		
		}
		@Test
		public void alertHandling() throws InterruptedException 
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
			Alert alt=driver.switchTo().alert();
			String expMsg="This is a warning message!";
			String actualMsg=alt.getText();//to get message
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(expMsg,actualMsg);
			Thread.sleep(5000);
			//alt.accept();//to click on ok
			alt.dismiss();// to click on cancel
			sa.assertAll();
			
		}
		@Test
		public void confirmBox() throws InterruptedException 
		{
			driver.findElement(By.xpath("//input[@value='Confirm Box']")).click();
			Alert alt=driver.switchTo().alert();
			String expMsg="Do you want to continue ?";
			String actualMsg=alt.getText();
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(expMsg,actualMsg);
			Thread.sleep(5000);
			alt.dismiss();
			sa.assertAll();
		}
		public void promptBox() throws InterruptedException 
		{
			driver.findElement(By.xpath("//input[@value='PromptBox']")).click();
			Alert alt=driver.switchTo().alert();
			String expMsg="Enter your name : ?";
			String actualMsg=alt.getText();
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(expMsg,actualMsg);
			Thread.sleep(5000);
			alt.sendKeys("Neha");
			//alt.dismiss();
			sa.assertAll();
		}

}
