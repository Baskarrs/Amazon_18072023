package org.test;

import java.util.Date;

import org.pages.Homepage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class ProductSearch extends BaseClass {
	
	@BeforeClass
	private void startApplication() {
		launchApplication("chrome", "https://www.amazon.in/", 10);

	}
	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("Start time...."+d);

	}
	@Test
	private void searchProduct() {
		Homepage hp = new Homepage();
		sendkeys(hp.getTxtSearch(),"iphone");
		btnClick(hp.getBtnSearch());

	}
	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("End time...."+d);

	}
	@AfterClass
	private void quitApplication() {
		quit();

	}

}
