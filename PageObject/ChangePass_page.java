package PageObject;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ChangePass_page extends TestBase {
	public ChangePass_Locator ChangeL;
	public ChangePass_page(){
		this.ChangeL=new ChangePass_Locator();
		PageFactory.initElements(driver, this.ChangeL);
	}
	public void Newpass(String newpass){
		ChangeL.Createpass.sendKeys(newpass);
	}
	public void Confirmpass(String Cpass){
		ChangeL.Confirmpass.sendKeys(Cpass);
	}
	public void Changepass()
	{
		ChangeL.ChangePassword.click();
	}
	public void ClickonMyProfile(){
		ChangeL.Click.click();
		ChangeL.Myprofile.click();
	}
	
}
