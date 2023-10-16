package com.testcases;

import org.apache.xmlbeans.UserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Usertypefunctionality<OriginalLogin> extends Basetest {
	OriginalLogin ol;
	UserType ut;
	
	public void UsertypeTestCases() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		ut = new UserType();
		
	}
	@Test
	public void UserTypeValidation() throws Throwable {
		((Object) ut).verifyUserType();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Usertypes");
		
		
	}
	@AfterMethod
	public void teardown() {
		
	}

}  


