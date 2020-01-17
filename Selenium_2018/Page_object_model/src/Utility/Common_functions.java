package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_functions {

	public static WebDriver driver;
	public static  Properties prop;
	
	public Properties readPropFile() throws IOException
	{
		//get the prop file path
		String filePath=System.getProperty("user.dir")+"\\src\\Test_data\\Config.properties";
		//read data from file
		FileInputStream fis=new FileInputStream(filePath);
		//to acess the method of properties class create object
		prop=new Properties();
		prop.load(fis);
		return prop;
		
		
	}

	public void browser_launch() throws IOException {
		
		readPropFile();
		String browserName=prop.getProperty("browser");
		String appUrl=prop.getProperty("appUrl");

		if (browserName.equalsIgnoreCase("chrome")) {
			String driverPath = System.getProperty("user.dir") + "\\src\\Browser_drivers\\chromedriver_2.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			String driverPath = System.getProperty("user.dir") + "\\src\\Browser_drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
		}
		
		 driver.manage().window().maximize();
		 driver.get(appUrl);
	}

	// ------------launch application---------------

	/*
	 * public void launch_app(String app_url) { driver.get(app_url); }
	 */

	public By get_locator(String loc_name, String loc_val) {
		By byobj;
		switch (loc_name) {
		case "id":
			byobj = By.id(loc_val);
			break;
		case "name":
			byobj = By.name(loc_val);
			break;
		case "xpath":
			byobj = By.xpath(loc_val);
			break;
		case "linkText":
			byobj = By.linkText(loc_val);
			break;
		case "partialLinkText":
			byobj = By.partialLinkText(loc_val);
			break;
		case "className":
			byobj = By.className(loc_val);
			break;
		case "tagName":
			byobj = By.tagName(loc_val);
			break;
		default:
			byobj = null;

		}
		return byobj;
	}

	public void senddata(String locator_name, String locator_val, String testdata) {
		boolean isPresent=chkElm_present(locator_name,locator_val);
		if(isPresent) {
		driver.findElement(get_locator(locator_name, locator_val)).sendKeys(testdata);
		}
		else {
			System.out.println("Element not present");
		}
	}
	
	public void senddata(String elmLoc) 
	{
	//elmLoc=id##
		String[] strArr=elmLoc.split("####");
		String locName=strArr[0];
		String locVal=strArr[1];
		String testData=strArr[2];
		
	}
	
	public void clickElm(String locator_name,String locator_val)
	{
		driver.findElement(get_locator(locator_name,locator_val)).click();
	} 
	public boolean chkElm_present(String locator_name,String locator_val) 
	{
		
		boolean res=driver.findElement(get_locator(locator_name,locator_val)).isDisplayed();
		 
		return res;
	}
	public String getElm_Text(String locator_name,String locator_val) 
	{
		String elmValue=driver.findElement(get_locator(locator_name,locator_val)).getText();
		
		 
		return elmValue;
	}
	public void logout_chk() 
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//div[@id='welcome-menu']//li//a[@href='/index.php/auth/logout']")).click();
		
	}
	/*public static void main(String[] args) {

		Common_functions obj = new Common_functions();
		obj.browser_launch("chrome", "https://opensource-demo.orangehrmlive.com/");
		obj.senddata("id", "txtUsername", "Admin");
		obj.senddata("id","txtPassword","admin123");
		obj.clickElm("id","btnLogin");
	}*/

}
