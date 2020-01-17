import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_automate {

	public static void main(String[] args) {
		
		String driver_path=System.getProperty("user.dir")+"//src//Browser_drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("Neha");
		driver.findElement(By.id("u_0_o")).sendKeys("Chaudhary");
		driver.findElement(By.id("u_0_r")).sendKeys("neha204050@gmail.com");
		driver.findElement(By.id("u_0_u")).sendKeys("neha204050@gmail.com");

		driver.findElement(By.id("u_0_w")).sendKeys("mytestingpwd");
		//select list
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("3");
		Select month= new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Oct");
		Select year= new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1994");
		//radio
		driver.findElement(By.id("u_0_9")).click();
		
		
		
		
	}

}
