package com.HerokuApp.PageFacotry;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class HerokuAppPage {
	
	private BaseTest objBaseTest;

	public HerokuAppPage(BaseTest basetest) {
		this.objBaseTest = basetest;
	}
	
	String actual_url = "https://the-internet.herokuapp.com/";
	
	//Locators
	By loc_verfyPageHeading = By.xpath("//h1[contains(text(),'Welcome to the-internet')]");
	By loc_linkABTesting = By.xpath("//a[text()='A/B Testing']");
	By loc_linkBasicAuth = By.xpath("//a[contains(text(),'Basic Auth')]");
	By loc_linkDropDown = By.xpath("//a[contains(text(),'Dropdown')]");
	By loc_linkDragAndDrop = By.xpath("//a[contains(text(),'Drag and Drop')]");
	
	
	
	public void verifyHerokuAppPage()
	{
		String strHerokuText = objBaseTest.getDriver().findElement(loc_verfyPageHeading).getText();
		System.out.println(strHerokuText);
		Assert.assertTrue(strHerokuText.equals("Welcome to the-internet"));
		
	}
	
	public void clickABTesting()
	{
		//objBaseTest.getObjSeleniumWrapperFunction().click(loc_linkABTesting);
		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_linkABTesting));
	}
	
	public void goBack()
	{
		objBaseTest.getObjSeleniumWrapperFunction().goBack();
	}
	
	public void clickBasicAuth()
	{
	objBaseTest.getObjSeleniumWrapperFunction().click(loc_linkBasicAuth);
	
	}
	
	public void clickDropdown(String strDropdownOption)
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().selectDropDown(loc_linkDropDown, strDropdownOption, "value"));
	}
	
	public void performDragAndDrop()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_linkDragAndDrop));
		//Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
