package com.PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class SigninPage 
{
private BaseTest objBaseTest;
private SeleniumWrapperFunction objSeleniumWrapperFunction;
	
	public SigninPage(BaseTest baseTest){
	
		this.objBaseTest = baseTest;
	}
	
	
	//heading locator
	//By loc_hdrSignPage = By.xpath("//img[@class='logo img-responsive']");
	By loc_btnLogin = By.xpath("//a[@title='Log in to your customer account']");
	By loc_textAuthenticationPage = By.xpath("//h1[contains(text(), 'Authentication')]");
	By loc_inpEmailAddress = By.xpath("//label[text()='Email address']/following::input[@id='email']");
    By loc_inpPassword = By.xpath("//label[text()='Password']/following::input[@id='passwd']");
    By loc_btnSignin = By.xpath("//button[@id= 'SubmitLogin']");
    
    
    
    //verify SigninPage
    
    public void clickLoginButton()
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_btnLogin));
    }
    
   
    
    
    public void verifySigninPageIsDisplayed()
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().isDisplayed(loc_textAuthenticationPage));
    	Reporter.log("verify Signin Page is displayed", true);
    }
    
    public void setEmailAddressOnSigninPage(String strEmailAddress)
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().setText(loc_inpEmailAddress, strEmailAddress));
    	Reporter.log("Set EmailAddress", true);
    }
    
    public void setPasswordOnSigninPage(String strPassword)
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().setText(loc_inpEmailAddress, strPassword));
    	Reporter.log("Set Password", true);
    }
    
    public void clickSigninButton()
    {
    	//objBaseTest.getObjSeleniumWrapperFunction().setImplicitlyWait(3000);
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunction().click(loc_btnSignin));
    	Reporter.log("click on signin button", true);
    }
    
    public void getAllLinksOnLoginPage()
    {
    	objBaseTest.getObjSeleniumWrapperFunction().setImplicitlyWait(10);
    	List<WebElement> allLinkList = objBaseTest.getDriver().findElements(By.tagName("a"));
    	System.out.println("Link List Size : "+allLinkList.size());
    	for (WebElement webElement : allLinkList) {
    		//System.out.println("All Links : "+webElement.getText());
    		Reporter.log("All Links : "+webElement.getText(), true);
			
		}
    }
    	
    	public void getSigninButtonTextOnSigninPage()
    	{
    		String strSigninText = objBaseTest.getDriver().findElement(loc_btnLogin).getText();
    		System.out.println("strSigninText : "+strSigninText);
    		
    	}
    




	  
    
    
    
    
    
    
    
}


