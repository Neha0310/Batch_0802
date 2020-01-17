package Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Read_data_frm_prop {
	

	public static void main(String[] args)  {
		
		
		File file=new File("E:\\sdet_training\\Selenium_2018\\Page_object_model\\src\\Utility\\testdata.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();

			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String driverPath = System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver = new ChromeDriver();

			driver.get(prop.getProperty("appURL"));

			driver.get(prop.getProperty("browser"));
			
			System.out.println("URL ::" + prop.getProperty("appURL"));
			
		//	driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));
		//	driver.findElement(By.id("Passwd")).sendKeys(prop.getProperty("password"));
}
}