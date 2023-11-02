package com.testcases;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.BeforeTest;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

public class Locationfunctionality  extends Basetest {

	LoginModule login;
	Loginfunctionality Location;

	public Locationfunctionality() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginModule();
		Location = new Loginfunctionality();
	}

	@Test(priority = 1)
	public void Condition_Functionality_Add() throws Throwable {
		login.login();
		Location.Location_Functionality_add();
		Location.Add_CategoryAssertMessage1();
		Location.Add_CategoryAssertMessage2();
	}

	@Test(priority = 2)
	public void Condition_Functionality_Edit() throws Throwable {
		Location.Location_Functionality_Edit();
		Location.Edit_CategoryAssertMessage1();
		Location.Edit_CategoryAssertMessage2();

	}

	@Test(priority = 3)
	public void Condition_Functionality_Delete() throws Throwable {
		Location.Categories_Functionality_Delete();
		Location.Delete_CategoryAssertMessage1();
		Location.Delete_CategoryAssertMessage2();

	}

	@AfterTest
	public void teardown() {

	}
} 
}
