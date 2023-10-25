package com.testcases;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;

public class Catageoriesfunctionality extends Basetest {
	LoginModule LP;
	com.pageobjects.Catageoriesfunctionality CF;
	
	public Catageoriesfunctionality(){
		super();
	}
@BeforeMethod
public void Data(){
	initialization();
	LP = new LoginModule();
	LP.Loginverification();
	CF = new com.pageobjects.Catageoriesfunctionality();
	}

@Test
public void AddCatageoriesData() throws Throwable {
 CF.VerifyCatageoriesFunctionality();
 String urltest = driver.getCurrentUrl();
 Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Categories" );
 }
@AfterMethod
public void teardown() {
	

}
} 


