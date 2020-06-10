package utilities;

import org.openqa.selenium.JavascriptExecutor;

import base.TestBase;

public class javaScript_utilities extends TestBase{
	
	//public JavascriptExecutor js;
	
	public void scroll_down_till_end(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scrollBy(0,500)");
	}
	

	public static void main(String args[]){
		
	}

}
