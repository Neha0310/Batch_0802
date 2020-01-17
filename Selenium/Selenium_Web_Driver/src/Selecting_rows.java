import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_rows {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		//System.out.println(javaVersion);
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		
		//Launch the browser
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		//driver.findElement(By.xpath("//a[contains(text(),'Test Lead')]/parent::td/preceding-sibling::td/input")).click();
		//driver.findElement(By.id("btnDelete")).click();
		//driver.findElement(By.id("dialogDeleteBtn")).click();
		
		//----------------------------------------------------------------------------------------
		
		//int count=driver.findElements(By.xpath("//td//a[contains(text(),'neha_1')]/parent::td/parent::tr/following-sibling::tr//a[contains(text(),'neha')]//parent::td//preceding-sibling::td")).size();
		int count=driver.findElements(By.xpath("//td/a[contains(text(),'neha_1')]/following::a[contains(text(),'neha')]/parent::td//preceding-sibling::td")).size();
		for(int i=1;i<=count;i++) 
		{
			//WebElement elm=driver.findElement(By.xpath("//td//a[contains(text(),'neha_1')]/parent::td/parent::tr/following-sibling::tr["+(i)+"]//a[contains(text(),'neha')]//parent::td//preceding-sibling::td"));
			WebElement elm=driver.findElement(By.xpath("//td/a[contains(text(),'neha_1')]/following::a[contains(text(),'neha')]["+(i)+"]/parent::td//preceding-sibling::td"));
			elm.click();
		}
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
	}

}
