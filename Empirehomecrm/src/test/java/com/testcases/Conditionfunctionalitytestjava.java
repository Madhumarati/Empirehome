package com.testcases;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Conditionfunctionality;

public class Conditionfunctionalitytestjava extends Basetest {

	LoginModule login;
	Conditionfunctionality Condition;

	public Conditionfunctionalitytestjava() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginModule();
		Condition = new Conditionfunctionality();
	}

	@Test(priority = 1)
	public void Condition_Functionality_Add() throws Throwable {
		login.login();
		Condition.Condition_functionality_Add();
		Condition.Add_ConditionAssertMessage();
	}

	@Test(priority = 2)
	public void Condition_Functionality_Edit() throws Throwable {

		Condition.Condition_functionality_Edit();
		Condition.Edit_ConditionAssertMessage();
	}

	@Test(priority = 3)
	public void Condition_Functionality_Delete() throws Throwable {
		Condition.Condition_functionality_Delete();
		Condition.Delete_ConditionAssertMessage();

	}

	@AfterTest
	public void teardown() {

	}
} 


