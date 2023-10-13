package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Loginpage1;
import com.pageobjects.StockMovefunctionality;

public class Stockmovefunctionality extends Basetest{
	Loginpage1 LP ;
	StockMovefunctionality SMF;
	
	public void Stock_moving () {
		super ();
	}
		
@BeforeMethod
public  void Data() {
	initialization();
	LP = new Loginpage1();
	StockmoveFunctionality SMF= new  StockmoveFunctionality();
}
@Test
public void Data1() throws Throwable {
	LP.Loginverification();
	  SMF.verifyStockmove();
	String urltest = driver.getCurrentUrl();
	Assert.asserteEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

}

@AfterMethod
public void teardown() {

}
} 


