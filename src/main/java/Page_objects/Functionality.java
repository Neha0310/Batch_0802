package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.Common_file;

public class Functionality  extends Common_file {
	public void test1() 
	{
		browser_launch();
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
