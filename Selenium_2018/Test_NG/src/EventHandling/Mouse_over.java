package EventHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mouse_over {
	WebDriver driver;
    Actions act;
	@BeforeClass
	public void browser_launch() {
	String driverPath = System.getProperty("user.dir") + "\\src\\Browser_drivers\\chromedriver_2.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	//driver.get("file:///E:/sdet_training/Template/template_7/index.html");
	//driver.findElement(By.xpath("//a[@href='nested_menus.html']")).click();
	driver.get("https://jqueryui.com/droppable/");
	 act=new Actions(driver);
	}
	@Test(enabled=false)
	public void mouseHandling() throws InterruptedException 
	{
		
		WebElement elm=driver.findElement(By.linkText("Projects"));
		act.moveToElement(elm).build().perform();
		WebElement elm1=driver.findElement(By.linkText("Exercise2"));
		act.moveToElement(elm1).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Alerts Handling")).click();
	}


	@Test
	public void dragNdrop() 
	{
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		//act.dragAndDrop(source, dest).perform();
		
		
		//second way
		
		act.clickAndHold(source);
		act.release(dest);
		act.build().perform();
		
		
	}
}
