package com.store23andme.base.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.store23andme.core.desktop.driver.Store23driver;

public class Store23andmeBasePage extends Store23driver {
	
	public WebDriver driver;
    
	private static final Logger logger = LogManager
			.getLogger(Store23andmeBasePage.class.getName());

	public Store23andmeBasePage(Store23driver driver) {
		super();
		
	}

	public WebDriver getWebdriver(){
		return driver;
	}

}
