package PageObject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;

public class Pricing_Page extends TestBase{

	public Pricing_Locators PricingL;
	public Pricing_Page(){
		this.PricingL=new Pricing_Locators();
		PageFactory.initElements(driver, this.PricingL);
	}
	
	public void ClickonPricing(){
		PricingL.PricingButton.click();
		
	}
	public void ClickonAppoinment(){
		PricingL.BookAppoinment.click();
	}
	public void Select_VComapny() throws InterruptedException{
		PricingL.SelectVComp.click();
		PricingL.Hero.click();
	}
	public void ClickonVehicalNo(String no){
		PricingL.Vehicalno.sendKeys(no);
	}
	public void Selectpackage(){
		PricingL.SelectPackage.click();
		PricingL.SmartGroom.click();
	}
	public void ClickonTermsAndCondition(){
		PricingL.TermsAndCondition.click();
	}
	public void Clickondate(){
		PricingL.Servicedate.click();
	}
	public void SendKeys(){
		PricingL.Servicedate.sendKeys(Keys.TAB);
	}
	public void ClickSubmitbutton(){
		PricingL.SubmitButton.click();
	}
	public void ClickonOkay(){
		PricingL.OkButton.click();
	}
	public void  ServiceDetails(String Sdate,String Ptime,String Paddress,String Dtime,String Daddress){
		PricingL.Servicedate.sendKeys(Sdate);
		PricingL.Pickuptime.sendKeys(Ptime);
		PricingL.Pickupaddress.sendKeys(Paddress);
		PricingL.Droptime.sendKeys(Dtime);
		PricingL.Dropaddress.sendKeys(Daddress);
		
		
	}
	
}
