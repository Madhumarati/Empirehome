package com.testcases;

import javax.security.auth.spi.LoginModule;

import org.apache.commons.math3.exception.util.ArgUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;

public abstract class Employeregistration<Employee_registration_Functionality, Employee> extends Basetest {
	LoginModule login;
	Employee_registration_Functionality Employee;
	private final String sheetname1 = "Employee_registration";

	public Employeregistration() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return ArgUtils.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		login = new LoginPage();
		Employee = new abstract Employee registration();

	}

	@Test(dataProvider = "dataload", dataProviderClass = Employee_registration_Functionality_Test.class)

	public void Employeevalidation(String Name,String Mail,String MobileNumber,String textbox) throws Throwable {
		login.verifylogin();
		Employee registration1(Name, Mail, MobileNumber, textbox);


	@AfterMethod
	public void teardown() {

	}

} 


