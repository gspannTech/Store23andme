package com.store23andme.base.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.stor23andme.core.constants.TestConstants;
import com.store23andme.base.properties.PropertiesBase;

public class Store23andmeRunnerBase extends PropertiesBase implements TestConstants {
public PropertiesBase properties;
private static final Logger logger = LogManager.getLogger(Store23andmeRunnerBase.class.getName());
	public Store23andmeRunnerBase(){
		properties = new PropertiesBase();
		
	}
	
	public PropertiesBase getProperties() {
        return properties;
    }

    public void setProperties(PropertiesBase properties) {
        this.properties = properties;
    }

	@BeforeSuite(alwaysRun = true)
	@Parameters({ "browser", "url" })
	public void setUpBeforeSuite(String browser, String url) throws Exception {
		logger.info("Setting up the test class...");
		try {
			System.out.print(url);
			properties.setBrowser(browser);
			properties.setUrl(url);

		} catch (Exception error) {
			logger.error(error.getMessage());
			Assert.fail(error.getMessage());
		}
		logger.info("Setup the test class.");
	}
         
	
	
}
