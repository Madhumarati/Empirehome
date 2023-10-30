package com.testcases;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;

public class Subcatageoriesfunctionality  extends Basetest {

	LoginModule login;
	Subcatageoriesfunctionality Sub_Catageories;

	public Subcatageoriesfunctionality() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginModule();
		Sub_Catageories = new Subcatageoriesfunctionality();

	}

	@Test(priority = 1)
	public void Sub_Catageories_Functionality_Add() throws Throwable {
		login.login();
		Sub_Catageories.Sub_Catageories_Functionality_Add();
		Sub_Catageories.Add_CategoryAssertMessage();
	}

	@Test(priority = 2)
	public void Sub_Catageories_Functionality_Edit() throws Throwable {
		Sub_Catageories.Sub_Catageories_Edit();
		Sub_Catageories.Edit_SubCategoryAssertMessage();
	}

	@Test(priority = 3)
	public void Sub_Catageories_Functionality_Delete() throws Throwable {
		Sub_Catageories.Sub_Catageories_Functionality_Delete();
		Sub_Catageories.Delete_SubCategoryAssertMessage();
	}
	@AfterTest
	public void teardown() {

	}
} 


