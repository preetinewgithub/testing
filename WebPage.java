package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class WebPage {
	
private BaseTest objBaseTest;
private SeleniumWrapperFunction objSeleniumWrapperFunction;
	
	public WebPage(BaseTest baseTest){
	
		this.objBaseTest = baseTest;
	}
	
	//Locators
	By loc_imgLogo = By.xpath("//img[@class='logo img-responsive']");
	By loc_hdrSignPage = By.xpath("//a[contains(text(), 'Sign in')]");
	
	
	//verify Homepage
	
	public void verifyWebPageIsDisplayed()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().isDisplayed(loc_imgLogo));
	}
	
	/* public void clickloginButton()
	    {
	    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_hdrSignPage));
	    }*/
	
	
	
	
	

}
