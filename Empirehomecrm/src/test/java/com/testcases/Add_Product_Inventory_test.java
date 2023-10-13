package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;

import com.pageobjects.Add_inventory_product;

import com.pageobjects.Loginpage1;
import com.utils.Dataprovider;

public class Add_Product_Inventory_test extends Basetest {

	private final String sheetname1 = "Sheet1";
	Loginpage1 Login;
	Add_inventory_product AddInventory;

	public Add_Product_Inventory_test() {
		super();
	}

	@DataProvider
	public Object[][] dataload() throws Throwable {
		return Dataprovider.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() {
		initialization();
		Login = new Loginpage1();
		AddInventory = new Add_inventory_product();
	}

	@Test(dataProvider = "dataload")
	public void addproductvalidation(String ModelNumber, String Tittle,String ItemDescription, String Height,String Width,String Breadth,String ColorName,String ActualPrice,String textMRP,String Qty ) throws Throwable {

		Login.verifyLogin();

		AddInventory.verifyAddInventorypage(ModelNumber, Tittle, ItemDescription, Height, Width, Breadth, ColorName,
				ActualPrice, textMRP, Qty);

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
		
		
	}
	

	@AfterMethod
	public void teardown() {
		
	}
}
