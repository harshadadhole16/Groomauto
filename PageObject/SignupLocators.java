package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupLocators {

		@FindBy(xpath="//li[@class='nav-item dropdown userProf']//a[1]")
		public WebElement Loginbutton;
		
		@FindBy(xpath="//a[@class='text-white']")
		public WebElement Signupbutton;
		
		@FindBy(xpath="//input[@id='fname']")
		public WebElement Fname;
		
		@FindBy(xpath="//input[@id='mobile_no']")
		public WebElement Mobileno;
		
		@FindBy(xpath="//input[@id='email']")
		public WebElement Email;
		
		@FindBy(xpath="//input[@id='create_pass']")
		public WebElement CreatePassword;
		
		@FindBy(xpath="//input[@id='Confirm_pass']")
		public WebElement ConfirmPassword;
		
		@FindBy(xpath="//label[@id='check13']")
		public WebElement Termcondition;
		
		@FindBy(xpath="//a[@id='savesignup']")
		public WebElement Submit;
		
		@FindBy(xpath="//form[@id='form']//a[@class='site-button outline gray'][contains(text(),'Back')]")
		public WebElement Backbutton;
		
		@FindBy(xpath="//button[@id='okDismiss']")
		public WebElement okay;
		
}
