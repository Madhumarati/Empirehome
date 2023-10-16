package com.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.Basetest;

public class Customerfunctionality extends Basetest {
	LoginPage login;
	Customerfunctionality Customer;
	private final String sheetname1 = "customerfunctionality";

	public Customerfunctionality() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		login = new LoginPage();
		Customer = new Customer_functionality();

	}

	@Test(dataProvider = "dataload", dataProviderClass = Customer_functionality_Test.class)

	public void Customervalidation(String EnterCustomerNameTesx,String EnterMobileNumberText,String EnterEmailIdText,String EnterWhatsappNumberText,String CustomerSearch,String REEnterCustomerName,String REEnterMobileNumber,String REEnterEmailId,String REEnterWhatsappNumber  ) throws Throwable {
		login.verifylogin();
		Customer.Customervalidation(EnterCustomerNameTesx, EnterMobileNumberText, EnterEmailIdText, EnterWhatsappNumberText, CustomerSearch, REEnterCustomerName, REEnterMobileNumber, REEnterEmailId, REEnterWhatsappNumber);

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/User/CustomerList");

	}

	@AfterMethod
	public void teardown() {

	}

} 


