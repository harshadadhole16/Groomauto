package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Getquotation_Locators {
	@FindBy(xpath="//span[@class='filter-option pull-left'][contains(text(),'Select Vehicle Company')]")
	WebElement Vechical_Company;
	
	@FindBy(xpath="//span[contains(text(),'Nothing selected')]")
	WebElement Vechical_Model;
	
	@FindBy(xpath="//span[@class='filter-option pull-left'][contains(text(),'Select Package')]")
	WebElement Select_Package;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement Name;
	
	@FindBy(xpath="//input[@id='mobile_no']")
	WebElement Mobile_no;
	
	@FindBy(xpath="//span[contains(text(),'Get Quotation')]")
	WebElement Get_Quotation;
	
	

}
