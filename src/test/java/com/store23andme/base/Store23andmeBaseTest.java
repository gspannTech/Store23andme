package com.store23andme.base;


import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.stor23andme.core.constants.TestConstants;
import com.store23andme.base.pages.Store23andmeRunnerBase;
import com.store23andme.core.desktop.driver.Store23driver;

public class Store23andmeBaseTest extends Store23andmeRunnerBase implements TestConstants{
   public static Store23driver driver = new Store23driver();
   private static final Logger logger = LogManager.getLogger(Store23andmeRunnerBase.class.getName());
	

	@BeforeSuite(alwaysRun = true)
	public void setupBeforeSuite() throws Exception {
		logger.info("Set up of test method started.");
		try{
			driver.launchbrowser(properties.getBrowser(), properties.getUrl());
			logger.info("Setup of test method finished.");
		} catch (Exception error) {
			logger.error(error.getMessage());
			logger.info("Setup of test method failed.");
			throw error;
		}
		
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterClass() throws IOException{
		driver.close();
	}
	
	
	
	
}
