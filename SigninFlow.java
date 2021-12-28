package com.Flows;

import java.util.Hashtable;

import com.PageFactory.SigninPage;
import com.PageFactory.WebPage;
import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class SigninFlow {
	
	private BaseTest objBaseTest;
	private SeleniumWrapperFunction objSeleniumWrapperFunction;
	private SigninPage objSigninPage;
	private WebPage objWebPage;
	
	public Hashtable<String, String> objHashtable;
	private String testdata="";
	
public SigninFlow(BaseTest baseTest){
		
		this.objBaseTest = baseTest;
		objSigninPage = new SigninPage(objBaseTest);
		objWebPage = new WebPage(baseTest);
		
		objHashtable = new Hashtable<String, String>();
		this.createValidUserCredential();
		
	}
	
	public Hashtable<String, String> createValidUserCredential(){
		objHashtable.put("EmailId", "preetisonawane25@gmail.com");
		objHashtable.put("Password", "preeti@112233");
		System.out.println("Hashtable testdata :"+objHashtable.toString());
		return objHashtable;
		}
	
/*	public Hashtable<String, String> createInValidUserCredential(){
		objHashtable.put("EmailId", "preetisonawane@gmail.com");
		objHashtable.put("Password", "preeti@123");
		System.out.println("Hashtable testdata :"+objHashtable.toString());
		return objHashtable;
		}*/

	public void verifyHomePageIsDisplayed()
	{
		objWebPage.verifyWebPageIsDisplayed();
	}
	
	public void clickLoginButton()
	{
		objSigninPage.clickLoginButton();
	}
	
	
	
	public void doSignin()
	
	{   
		//objSigninPage.clickLoginButton();
		testdata = objHashtable.get("EmailId");
		if(!testdata.equals(""))	
		objSigninPage.setEmailAddressOnSigninPage(testdata);
		
		testdata = objHashtable.get("Password");
		if(!testdata.equals(""))
		objSigninPage.setPasswordOnSigninPage(testdata);
		objSigninPage.clickSigninButton();
	}
	
	
	
	
	
	
	
	
	
}