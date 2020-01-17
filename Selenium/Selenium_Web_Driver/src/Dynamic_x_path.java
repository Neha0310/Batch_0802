import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_x_path {

	public static void main(String[] args) {
		String driver_path=System.getProperty("user.dir")+"//src//Browser_drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		int count=driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a")).size();
        System.out.println(count);
		for(int i=0;i<count;i++) 
		{
			WebElement elm=driver.findElement(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li["+(i+1)+"]/a"));
			String alink=elm.getAttribute("href");
			String linktext=elm.getText();
			//System.out.println(linktext+" "+alink);
			driver.navigate().to(alink);
			System.out.println("links:-  "+driver.getCurrentUrl());
			driver.navigate().back(); 
			
			//$x("//a[contains(text(),'Test Lead')]/parent::td/preceding-sibling::td/input");
		} 
		
	}

}
