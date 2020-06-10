package testCases;

import org.testng.annotations.Test;

import PageObject.Getquotation_Page;
import base.TestBase;
import utilities.javaScript_utilities;
import org.testng.annotations.BeforeTest;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class TestcaseQuotation extends TestBase{
	public Getquotation_Page getquotationPage;
	public javaScript_utilities  javautil;
	
  @Test(priority=1)
  public void VechicalCompany() throws InterruptedException {
	  getquotationPage=new Getquotation_Page();
	  javautil=new javaScript_utilities();
	  Thread.sleep(5000);
	  javautil.scroll_down_till_end();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//button[@title='Select Vehicle Company']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[contains(text(),'Hero')]")).click();
	  
	  driver.findElement(By.xpath("//span[@class='filter-option pull-left'][contains(text(),'Select Package')]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[contains(text(),'Smart Groom')]")).click();
	  Thread.sleep(10000);
	  getquotationPage.ClickOnName();
	  getquotationPage.Entername("Harshada");
	  getquotationPage.ClickonMobile();
	  getquotationPage.Entermobile("8551904367");
	  getquotationPage.ClickonGetquotation();
	  
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
