package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.testbase.TestBase;

public class LoginPageTest extends TestBase 
{
	 LoginPage lg ;
	HomePage homepage;
	
public LoginPageTest()
{
	super();
	
}
@BeforeMethod
public void setup()
{
	intialization();
	 lg = new LoginPage();
	 
	
}
/*@Test(priority=3)
public void testtitle()
{
	
	String actual_title=lg.loginpagetitle();
	Assert.assertEquals(actual_title,"CRMPRO");
}
@Test(priority=2)
public void logotest()
{
	
	Boolean flag=lg.checkcrmimage();
	Assert.assertTrue(flag);
}*/
@Test(priority=1)
public void logintest()
{
 homepage=lg.login("username","password");
}

@AfterMethod
public void teardown()
{
	driver.quit();
}	
	
}
