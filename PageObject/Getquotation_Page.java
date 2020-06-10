package PageObject;


//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;
//import utilities.Drop_Down;
//import utilities.javaScript_utilities;

public class Getquotation_Page extends TestBase {
	public Getquotation_Locators getLocator;
	public Getquotation_Page(){
		
		this.getLocator=new Getquotation_Locators();
		PageFactory.initElements(driver, this.getLocator);
		
	}
	
	public void ClickOnName(){
		getLocator.Name.click();
	}
	public void ClickonMobile(){
		getLocator.Mobile_no.click();
	}
	public void Entername(String name){
		getLocator.Name.sendKeys(name);
	}
	public void Entermobile(String mno){
		getLocator.Mobile_no.sendKeys(mno);
	}
	public void ClickonGetquotation(){
		getLocator.Get_Quotation.click();
	}

	  
	  
}
	

	

