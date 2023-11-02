package com.testcases;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Catageoriesfunctionality;

public class Shiftsfunctionalitytestjava extends Basetest {

	LoginModule login;
	Catageoriesfunctionality Shifts;

	public Shiftsfunctionalitytestjava() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginModule();
		Shifts = new Catageoriesfunctionality();
	}

	@Test(priority = 1)
	public void Shifts_Functionality_Add() throws Throwable {
		login.login();
		Shifts.Catageories_Functionality_add();
		Shifts.Add_ShiftsAssertMessage();

	}

	@Test(priority = 2)
	public void Shifts_Functionality_Edit() throws Throwable {

		Shifts.Catageories_Functionality_Edit();

		Shifts.Edit_ShiftsAssertMessage();

	}

	@Test(priority = 3)
	public void Shifts_Functionality_Delete() throws Throwable {
		Shifts.Categories_Functionality_Delete();
		Shifts.Delete_ShiftsAssertMessage();

	}

	@AfterTest
	public void teardown() {

	}
} 

