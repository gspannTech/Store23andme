package com.store23andme.base.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.store23andme.core.desktop.driver.Store23driver;

public class Store23andmeBasePage extends Store23driver {

	private static final Logger logger = LogManager.getLogger(Store23andmeBasePage.class.getName());
	protected Store23driver driver = new Store23driver();
	
	public Store23andmeBasePage(Store23driver driver) {
	
		this.driver = driver;

	}


}
