package com.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage1;

public class HolidaysFunctionality  extends Basetest {
	Loginpage1 login;
	HolidaysFunctionality holidays;
	 
	
	public HolidaysFunctionality() {
		super();
	}	
	@BeforeMethod
	public void setup() {
		initialization();
		
		login = new Loginpage1();
		holidays = new HolidaysFunctionality();
	}
	@Test	
	public void Holidaysvalidation() {
		login.Loginverification();
		holidays.Holidaysvalidation();
		
		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirename,myprojectonline.co.in/master/Holidays");
	}
		
	@AfterMethod
	public void teardown() {
		
	}
	

} {

}
