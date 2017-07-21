package com.store23andme.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.store23andme.base.pages.Store23andmeBasePage;
import com.store23andme.core.desktop.driver.Store23driver;

public class Homepage extends Store23andmeBasePage{
	
	public static final By ADD_LINK = By.xpath("//span[@class='quantity-control-button js-add-kit']");
	public static final By NAME_TEXT_FIELD = By.xpath("(//input[contains(@id,'-name')])[%s]");
	public  static final By CONTINUE_BUTTON = By.xpath("//form[@class='js-cart-form']/input[@value='continue']");
	//public static WebDriver driver;
	
	public Homepage(Store23driver driver) {
		super(driver);
	}
	
	public void clickAddButtonHealthAncestry(){
		driver.findElement(By.xpath("//span[@class='quantity-control-button js-add-kit']")).click();
	}
	
	public void fillNameField(int number, String name){
		driver.findElement(By.xpath(String.format("(//input[contains(@id,'-name')])[%s]", number))).sendKeys(name);
		
	}

	public void clickContinueButton(){
		driver.findElement(CONTINUE_BUTTON).click();
	}
	
	
}
