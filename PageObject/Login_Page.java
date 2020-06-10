package PageObject;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Login_Page extends TestBase{
	public Login_Locators Login;
	public Login_Page(){
		this.Login=new Login_Locators();
		PageFactory.initElements(driver, this.Login);
		}
	public void Clickonhomelogin(){
		Login.Homelogin.click();
	}
	
	public void Fillusername(String uname){
		Login.Username.sendKeys(uname);
	}
	public void Fillpassword(String pass){
		Login.Userpassword.sendKeys(pass);
	}
	public void ClickonLOk()
	{
		Login.Lokay.click();
	}
	public void Clickonlogin1(String uname,String pass)
	{
		Fillusername(uname);
		Fillpassword(pass);
		Login.Login1button.click();
		
	}
}
