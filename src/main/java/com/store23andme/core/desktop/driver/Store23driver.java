package com.store23andme.core.desktop.driver;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.stor23andme.core.constants.TestConstants;
import come.store23andme.core.driver.setBrowser;

public class Store23driver implements WebDriver , setBrowser, TestConstants{

	private WebDriver driver;
	static String driverPath = System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserExeFiles";

	public WebDriver getDriver() {
		return driver;
	}

	public void launchbrowser(String browserType, String url) {
		if (browserType.equalsIgnoreCase(TestConstants.CHROME_BROWSER)) {		
			driver = initChromeDriver(url);
		}else if (browserType.equalsIgnoreCase(TestConstants.MOZILLA_BROWSER)) {
			driver = initFirefoxDriver(url);
		}else{
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(url);
		}
	}
	

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	
	public void get(String url) {
		
		
	}

	public String getCurrentUrl() {
		
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> findElements(By by) {
		return null;
	}

	public WebElement findElement(By by) {
		return null;
	}

	public String getPageSource() {
		return null;
	}

	public void close() {
		
	}

	public void quit() {
		
	}

	public Set<String> getWindowHandles() {
		return null;
	}

	public String getWindowHandle() {
		return null;
	}

	public TargetLocator switchTo() {
		return null;
	}

	public Navigation navigate() {
		return null;
	}

	public Options manage() {
		return null;
	}

	

	
	
}
