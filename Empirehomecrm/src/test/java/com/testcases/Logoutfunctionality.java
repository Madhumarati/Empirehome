package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

public class Logoutfunctionality   extends Basetest {
	
	
	
	Loginfunctionality lf;
	Loginfunctionality logout;
	
	public Logoutfunctionality() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		logout =new Loginfunctionality();
		}
	
	@Test
	public void logoutvalidation() throws Throwable {
		
		
         logout.verifylogin();
		
		String urltest = driver.getCurrentUrl();
		Assert.notEmpty(urltest, "http://empirehome.myprojectsonline.co.in/");
	}
	
	@AfterMethod
	public void teardown() {
		
	}

} 


