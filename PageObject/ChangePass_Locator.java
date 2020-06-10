package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePass_Locator {

	@FindBy(xpath="//input[@id='create_pass']")
	WebElement Createpass;
	
	@FindBy(xpath="//input[@id='Confirm_pass']")
	WebElement Confirmpass;
	
	@FindBy(xpath="//a[@id='changePwd']")
	WebElement ChangePassword;

	@FindBy(xpath="//a[@class='dropdown-toggle profile-pic']")
	WebElement Click;
	
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement Myprofile;
}
