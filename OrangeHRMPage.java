package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class OrangeHRMPage
{
	private BaseTest objBaseTest;
	
	public OrangeHRMPage(BaseTest baseTest){
	
		this.objBaseTest = baseTest;
	}
	
	String actual_url="https://opensource-demo.orangehrmlive.com";
	
	//Locators
	By loc_verifyPageTitle = By.xpath("//img[@src='/webres_61c2db0ad16600.32579756/themes/default/images/login/logo.png']");
	By loc_inptUsername = By.xpath("//input[@id='txtUsername']");
	By loc_inptPassword = By.xpath("//input[@id='txtPassword']");
	By loc_btnLogin = By.xpath("//input[@id='btnLogin']");
	
	
	
	
	public void verifyTitleOfPage()
	{
		String strOrangehRmPageTitle = objBaseTest.getDriver().findElement(loc_verifyPageTitle).getText();
		System.out.println("strOrangehRmPageTitle");
		//Assert.assertTrue(strOrangehRmPageTitle.equals("OrangeHRM"));
	}
	
	public void setUsernameInOrangeHRMPage()
	{
		System.out.println("Username is : Admin");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().setText(loc_inptUsername, "Admin"));
		//objBaseTest.getDriver().findElement(loc_inptUsername).sendKeys("Admin");
	}
	
	public void setPasswordInOrangeHRMPage()
	{
		System.out.println("Password is : admin123");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().setText(loc_inptPassword, "admin123"));
		//objBaseTest.getDriver().findElement(loc_inptPassword).sendKeys("admin123");
	}
	
	public void clickLoginbutton()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_btnLogin));
		//objBaseTest.getDriver().findElement(loc_btnLogin).click();
	}
	
	
	
	
	

}
