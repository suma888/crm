package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.testbase.TestBase;
import com.crm.qa.Util.TestUtil;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase
{
	
	HomePage homepage; 
	ContactsPage contactsPage;
	LoginPage lg ;
	TestUtil testUtil;
	
  public HomePageTest()
  {
	  super();
  }
  @BeforeMethod
	public void setUp()
	{
		intialization();
		lg = new LoginPage();
		homepage = new HomePage();
		contactsPage= new ContactsPage();
		testUtil = new TestUtil();
		//homepage=lg.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage=lg.login("username","password");
	}
	@Test
	public void clickoncontactTest()
	{   
		
	   testUtil.SwitchToFrame();
		contactsPage = homepage.clickonNewContactlink();
	    
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
