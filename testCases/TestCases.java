package testCases;

import org.testng.annotations.Test;
import PageObject.Sign_Up;
import base.TestBase;
import utilities.javaScript_utilities;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.testng.annotations.AfterTest;

public class TestCases extends TestBase {

	public Sign_Up signup;
	public javaScript_utilities javautil;
	
	@Test(priority=1)
	public void emptymobilefield() throws IOException, InterruptedException {
	  
	  signup = new Sign_Up();
	  javautil=new javaScript_utilities();
	  signup.ClickonLogin();
	  Thread.sleep(5000);
	  signup.ClickonSignup();
	  javautil.scroll_down_till_end();
		signup.Resgister("Harshada", "", "abcs@gmail.com", "1234", "1234");
		Thread.sleep(5000);
		signup.ClickonOk();
		Thread.sleep(5000);
		 driver.navigate().refresh();
  }
  	@Test(priority=2)
  	public void fullblank() throws IOException, InterruptedException{
	  signup=new Sign_Up();
	  javautil=new javaScript_utilities();
	  Thread.sleep(5000);
	  signup.ClickonSignup();
	  javautil.scroll_down_till_end();
	  signup.Resgister("", "", "", "", "");
	  Thread.sleep(5000);
		signup.ClickonOk();
		Thread.sleep(5000);
		 driver.navigate().refresh();
  }
  @Test(priority=3)
  public void wrongemail() throws InterruptedException{
	  signup=new Sign_Up();
	  javautil=new javaScript_utilities();
	  Thread.sleep(5000);
	  signup.ClickonSignup();
	  javautil.scroll_down_till_end();
	  signup.Resgister("Harshada", "9925783678", "abcdgmail.com", "1234", "1234");
	  Thread.sleep(5000);
	  signup.ClickonOk();
	  Thread.sleep(5000);
	  driver.navigate().refresh();
  }
  @Test(priority=4)
  public void incorrectpass() throws InterruptedException{
	  signup=new Sign_Up();
	  javautil=new javaScript_utilities();
	  Thread.sleep(5000);
	  signup.ClickonSignup();
	  javautil.scroll_down_till_end();
	  signup.Popupresgister("Harshada", "9925783678", "abcd@gmail.com", "1234", "123");
	  Thread.sleep(5000);
	  signup.ClickonOk();
	  Thread.sleep(5000);
	  driver.navigate().refresh();

  }
  @Test(priority=5)
  public void withoutagree() throws InterruptedException{
	  signup=new Sign_Up();
	  javautil=new javaScript_utilities();
	  Thread.sleep(5000);
	  signup.ClickonSignup();
	  javautil.scroll_down_till_end();
	  signup.WithoutTerms("Harshada", "9925783678", "abcd@gmail.com", "1234", "1234");
	  Thread.sleep(5000);
		signup.ClickonOk();
		Thread.sleep(5000);
		driver.navigate().refresh();
	  
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
