package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testbase.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'User: Suma S')]")
	WebElement Usernameclick;
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
			WebElement contacts;
	
	public HomePage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public ContactsPage clickonNewContactlink()
	{
		
		contacts.click();
		return new ContactsPage();
		
	}
	
	
	
}
