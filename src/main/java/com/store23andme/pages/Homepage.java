package com.store23andme.pages;

import org.openqa.selenium.By;

import com.store23andme.base.pages.Store23andmeBasePage;
import com.store23andme.core.desktop.driver.Store23driver;

public class Homepage extends Store23andmeBasePage{
	
	public static final By SIGNIN_LINK = By.id("com.sephora:id/sign_in");
	public static final By CREATE_ACCOUNT = By.id("com.sephora:id/create_account");
	
	
	public Homepage(Store23driver driver) {
		super(driver);
	}
	
	
	
	

}
