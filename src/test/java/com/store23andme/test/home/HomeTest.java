package com.store23andme.test.home;

import org.testng.annotations.Test;



public class HomeTest extends HomeBase {
	
	@Test
	public void testAddItemsToBasket(){
		
		homePage.clickAddButtonHealthAncestry();
		homePage.fillNameField(1, "Emma");
		homePage.clickAddButtonHealthAncestry();
		homePage.fillNameField(1, "Emily");
		homePage.clickAddButtonHealthAncestry();
		homePage.fillNameField(1, "Anny");
		homePage.clickContinueButton();
		
	}
	
}
