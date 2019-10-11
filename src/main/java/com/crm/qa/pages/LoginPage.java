package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testbase.TestBase;


public class LoginPage extends TestBase
{

	//Pagefactory OR repository
	
	@FindBy(name= "username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbutton;
	

	/*@FindBy(css="input[value='Login']")
	WebElement loginbutton;*/
	
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
	//pagefactory initiliazzation
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
 public String loginpagetitle()
 {
	 return driver.getTitle();
	 
 }
 public boolean checkcrmimage()
 {
 return crmlogo.isDisplayed();
 }
 
 public HomePage login(String usr,String pwd)
 {
	 
	 try {
		 username.sendKeys(prop.getProperty(usr));
		 password.sendKeys(prop.getProperty(pwd));
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 loginbutton.click();
	 
	 return new HomePage();
	 	 
 }
 
}
	
	
	
	
	

