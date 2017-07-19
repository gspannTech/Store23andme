package com.store23andme.test.home;

import com.store23andme.base.Store23andmeBaseTest;
import com.store23andme.pages.Homepage;

public class HomeBase extends Store23andmeBaseTest{

protected Homepage homePage;
	
	public HomeBase() {
		homePage = new Homepage(driver);
	}
	
	
}
