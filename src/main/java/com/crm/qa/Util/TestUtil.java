package com.crm.qa.Util;

import com.crm.qa.testbase.TestBase;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT= 1;
	
	public void SwitchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
	
}
