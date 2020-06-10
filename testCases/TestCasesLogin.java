package testCases;

import org.testng.annotations.Test;

import PageObject.Login_Page;
import base.TestBase;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class TestCasesLogin extends TestBase{
	public Login_Page loginpage;
	
  @Test(priority=1)
  public void Emptyfield() throws InterruptedException {
	  loginpage=new Login_Page();
	  loginpage.Clickonhomelogin();
	  Thread.sleep(5000);
	  loginpage.Clickonlogin1("", "");
	  Thread.sleep(5000);
	  loginpage.ClickonLOk();
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  
  }
  @Test(priority=2)
  public void IncorrectEmail() throws InterruptedException{
	  loginpage=new Login_Page();
	  loginpage.Clickonlogin1("abcdgmail.com", "1234");
	  Thread.sleep(5000);
	  loginpage.ClickonLOk();
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  
  }
  @Test(priority=3)
  public void Incorrectpass() throws InterruptedException{
	  loginpage=new Login_Page();
	  loginpage.Clickonlogin1("abcd@gmail.com", "");
	  Thread.sleep(5000);
	  loginpage.ClickonLOk();
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  }
  @Test(priority=4)
  public void Succesfullogin() throws InterruptedException{
	  loginpage=new Login_Page();
	  loginpage.Clickonlogin1("harshadadhole7@gmail.com", "DHOLE1771");
	  Thread.sleep(5000);
	  
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
