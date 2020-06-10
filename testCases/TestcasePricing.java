package testCases;

import org.testng.annotations.Test;

import PageObject.Login_Page;
import PageObject.Pricing_Page;
import base.TestBase;
import utilities.javaScript_utilities;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class TestcasePricing extends TestBase {
	public Pricing_Page PricingP;
	public javaScript_utilities  javautil;
	public Login_Page LoginP;
  @Test(priority=1)
  public void BookAppointment() throws InterruptedException {
	  PricingP=new Pricing_Page();
	  javautil=new javaScript_utilities();
	  LoginP=new Login_Page();
	  LoginP.Clickonhomelogin();
	  Thread.sleep(5000);
	  LoginP.Clickonlogin1("harshadadhole7@gmail.com", "DHOLE1771");
	  PricingP.ClickonPricing();
	  javautil.scroll_down_till_end();
	  PricingP.ClickonAppoinment();
	  Thread.sleep(5000);
	  PricingP.Select_VComapny();
	  javautil.scroll_down_till_end();
	  PricingP.ClickonVehicalNo("Mk1770");
	  PricingP.Selectpackage();
	  PricingP.ServiceDetails("12/4/2020", "2:00pm", "xyz", "6:00pm", "xyz");
	  PricingP.Clickondate();
	  PricingP.SendKeys();
	 
	  Thread.sleep(5000);
	  PricingP.ClickonTermsAndCondition();
	  javautil.scroll_down_till_end();
	  PricingP.ClickSubmitbutton();
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
