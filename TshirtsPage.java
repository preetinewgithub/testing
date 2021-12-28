package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class TshirtsPage 
{
	
	private BaseTest objBaseTest;
	private SeleniumWrapperFunction objSeleniumWrapperFunction;
		
		public TshirtsPage(BaseTest baseTest){
		
			this.objBaseTest = baseTest;
		}
		
		
		//Locators
		By loc_hdrTshirtsPage = By.xpath("//span[contains(text(), 'T-shirts ')]");
		By loc_hovrbtnTshirt = By.xpath("//img[@alt='Faded Short Sleeve T-shirts']");
		By loc_btnAddToCart = By.xpath("//span[text()='Add to cart']");
		
		public void verifyTshirtsPageIsDisplayed()
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().isDisplayed(loc_hdrTshirtsPage));
			Reporter.log("Verify T-Shirts Page is displayed", true);
		}
		
		public void moveToShortSleevTshirtOnTshirtPage()
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().moveToObject(loc_hovrbtnTshirt));
			Reporter.log("Mouse over to Tshirt", true);
			
			
		}
		
		public void clickBtnAddToCart()
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_btnAddToCart));
		}
		
		
		
		

}
