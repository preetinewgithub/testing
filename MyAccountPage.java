package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class MyAccountPage 
{
	private BaseTest objBaseTest;
	private SeleniumWrapperFunction objSeleniumWrapperFunction;
		
		public MyAccountPage(BaseTest baseTest){
		
			this.objBaseTest = baseTest;
		}
		
		
		//Locators
		
		By loc_hdrAccountPage = By.xpath("//h1[contains(text(), 'My account')]");
		By loc_hovrbtnWomen= By.xpath("//a[text()='Women']");
		By loc_btntShirts = By.xpath("//a[text() = 'T-shirts']/preceding::a[text() = 'Tops']");
		
		
		
		
	
		
		
		public void verifyMyAccountPageisDisplayed()
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().isDisplayed(loc_hdrAccountPage));
			Reporter.log("Verify My account Page is displayed", true);
		}
		
		public void moveToWomenOnMyAccountPage()
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().moveToObject(loc_hovrbtnWomen));
			Reporter.log("Mouse over to women", true);
		}
		
		public void clickTshirtsOnMyAccountPage()
		{//explicit wait
			objBaseTest.getObjSeleniumWrapperFunction().explicitWait(loc_btntShirts, 2);
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_btntShirts));
		}
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


