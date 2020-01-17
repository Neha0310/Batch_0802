


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_data_in_text_fields {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		//System.out.println(javaVersion);
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		
		//Launch the browser
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//to maximize window
		driver.manage().window().maximize();
		
		//to enter data in textfields.
	//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//to click on button
	//	driver.findElement(By.id("btnLogin")).click();
		
		//for links
		//using linkText
	//	driver.findElement(By.linkText("Forgot your password?")).click();
		//using partialLinkText
	//	driver.findElement(By.partialLinkText("Forgot your passwo")).click();
		
		//by using class
		//to find elements with classname same
		//to find size 
		int count=driver.findElements(By.className("textInputContainer")).size();
		System.out.println(count);
		
	//	driver.findElements(By.className("textInputContainer"))
	//	.get(0).sendKeys("Admin");
		
		//by tagname
		//to get text displayed between two tags.
	String data=	driver.findElements(By.tagName("span")).get(0).getText();
System.out.println(data);
	}

}
