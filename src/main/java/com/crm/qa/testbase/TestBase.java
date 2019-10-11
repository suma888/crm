package com.crm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.crm.qa.Util.TestUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase()
	{
		try
		{
			 prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/Suma/WorkspaceNeon/Web/src/main/java/com/crm/qa/config/config.properties"); 
		prop.load(ip);
		
		System.out.print("browser");
		}
		catch(FileNotFoundException e)
		{
			
		}catch(IOException e)
		{
		}
	}
		public static void intialization()
		{
		String Browsername = prop.getProperty("browser");
		if (Browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/Suma/WorkspaceNeon/Web/lib/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./lib/firefoxdriver.exe/");
		}
		else
		{
			System.out.print("no browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.MINUTES);
		driver.get(prop.getProperty("url"));
		
		}
		
		
	}
	
		
	

