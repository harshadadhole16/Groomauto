package testCases;

import org.testng.annotations.Test;

import PageObject.ChangePass_page;
import PageObject.Login_Page;
import PageObject.Pricing_Page;
import base.TestBase;
import utilities.javaScript_utilities;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class TestcaseChangepass extends TestBase{
	public ChangePass_page ChangeP;
	public Pricing_Page PricingP;
	public javaScript_utilities  javautil;
	public Login_Page LoginP;
	
	
  @Test
  public void Forgotpassword() throws InterruptedException {
	  ChangeP=new ChangePass_page();
	  PricingP=new Pricing_Page();
	  javautil=new javaScript_utilities();
	  LoginP=new Login_Page();
	  LoginP.Clickonhomelogin();
	  Thread.sleep(5000);
	  LoginP.Clickonlogin1("harshadadhole7@gmail.com", "DHOLE1771");
	  ChangeP.ClickonMyProfile();
	  javautil.scroll_down_till_end();
	  ChangeP.Newpass("DHOLE1771");
	  ChangeP.Confirmpass("DHOLE1771");
	  ChangeP.Changepass();
	  Thread.sleep(5000);
	  PricingP.ClickonOkay();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  TestBase.setUp();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
