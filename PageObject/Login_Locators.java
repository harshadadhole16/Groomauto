package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Locators {
	@FindBy(xpath="//li[@class='nav-item dropdown userProf']//a[1]")
	public WebElement Homelogin;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement Userpassword;
	
	@FindBy(xpath="//a[@id='login1']")
	public WebElement Login1button;
	
	@FindBy(xpath="//label[contains(text(),'Remember Me')]")
	public WebElement Rememberme;
	
	@FindBy(xpath="//a[@class='m-l10']")
	public WebElement Forgotpassword;

	@FindBy(xpath="//button[@id='okDismiss']")
	public WebElement Lokay;
}
