package PageObject;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Sign_Up extends TestBase {
	//WebDriver driver;
	public SignupLocators SignUp;
	 public Sign_Up()
	 {
		 this.SignUp=new SignupLocators();
		 PageFactory.initElements(driver,this.SignUp);
		 
	 }
	 public WebElement sumbit_btn(){
		return SignUp.Signupbutton;
		 
	 }
	public void ClickonLogin()
	{
		SignUp.Loginbutton.click();
	}
	public void ClickonSignup()
	{
		SignUp.Signupbutton.click();
	}
	public void FillFirstName(String fnm)
	{
		SignUp.Fname.sendKeys(fnm);
	}
	public void FillMobileno(String mno)
	{
		SignUp.Mobileno.sendKeys(mno);
	}
	public void FillEmail(String email)
	{
		SignUp.Email.sendKeys(email);
	} 
	public void FillPassword(String cpass)
	{
		SignUp.CreatePassword.sendKeys(cpass);
	}
	public void Fillconfirmpass(String confirmpass)
	{
		SignUp.ConfirmPassword.sendKeys(confirmpass);
	}
	public void Checktermcondition()
	{
		SignUp.Termcondition.click();
	}
	public void Clickonsubmit()
	{
		SignUp.Submit.click();
	}
	public void Backbutton()
	{
		SignUp.Backbutton.click();
	}
	public void ClickonOk(){
		SignUp.okay.click();
	}
	public void WithoutTerms(String fnm,String mno,String email,String cpass,String confirmpass)
	{
		FillFirstName(fnm);
		FillMobileno(mno);
		FillEmail(email);
		FillPassword(cpass);
		Fillconfirmpass(confirmpass);
		Clickonsubmit();
		
	}
	public void Resgister(String fnm,String mno,String email,String cpass,String confirmpass){
		FillFirstName(fnm);
		FillMobileno(mno);
		FillEmail(email);
		FillPassword(cpass);
		Fillconfirmpass(confirmpass);
		Checktermcondition();
		Clickonsubmit();
		
	}
	public void Popupresgister(String fnm,String mno,String email,String cpass,String confirmpass){
		FillFirstName(fnm);
		FillMobileno(mno);
		FillEmail(email);
		FillPassword(cpass);
		Fillconfirmpass(confirmpass);
		Checktermcondition();	
	}
	

}
