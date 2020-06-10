package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pricing_Locators {
	@FindBy(xpath="//ul[@class='nav navbar-nav nav-style']//a[contains(text(),'Pricing')]")
	WebElement PricingButton;
	
	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[1]//div[3]//a[1]")
	WebElement BookAppoinment;
	
	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[1]//div[3]//a[1]")
	WebElement BVechicalCompany;
	
	@FindBy(xpath="//input[@id='vehicle_no']")
	WebElement Vehicalno;
	
	@FindBy(xpath="//span[@class='filter-option pull-left'][contains(text(),'Select Package')]")
	WebElement SelectPackage;
	
	@FindBy(xpath="//input[@id='price']")
	WebElement Price;
	
	@FindBy(xpath="//input[@id='service_date']")
	WebElement Servicedate;
	
	@FindBy(xpath="//input[@id='pickup_time']")
	WebElement Pickuptime;
	
	@FindBy(xpath="//input[@id='pickup_address']")
	WebElement Pickupaddress;
	
	@FindBy(xpath="//input[@id='drop_time']")
	WebElement Droptime;
	
	@FindBy(xpath="//input[@id='drop_address']")
	WebElement Dropaddress;
	
	@FindBy(xpath="//label[@id='check13']")
	WebElement TermsAndCondition;
	
	@FindBy(xpath="//button[@title='Select Vehicle Company']")
	WebElement SelectVComp;
	
	@FindBy(xpath="//span[contains(text(),'Hero')]")
	WebElement Hero;
	
	@FindBy(xpath="//span[contains(text(),'Smart Groom')]")
	WebElement SmartGroom;
	
	@FindBy(xpath="//div[@class='datepicker-days']//tbody")
	WebElement Activedate;
	
	@FindBy(xpath="//a[@id='savebookings']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//button[@id='okDismiss']")
	WebElement OkButton;
}
