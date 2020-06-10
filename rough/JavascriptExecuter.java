package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.TestBase;
//import seleniumdemo.JavascriptExecuter;

public class JavascriptExecuter extends TestBase{
	public static void main(String args[]) {
		WebElement subbutton = 
				driver.findElement(By.xpath("//a[@id='savesignup']"));
				int y = subbutton.getLocation().getY();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,"+y+")");
				
		
	}

	
		
	

	
	
}
