package Browser_drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
		
		String driver_path=System.getProperty("user.dir")+"//src//Browser_drivers//chromedriver.exe";
		//System.out.println(driver_path);
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//By x-path
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		WebElement elm =driver.findElement(By.xpath
				("//div[text()='LOGIN Panel']"));
		boolean res=elm.isDisplayed();
		System.out.println(res);
		

	}

}
