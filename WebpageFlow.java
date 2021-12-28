package com.Flows;

import com.PageFactory.SigninPage;
import com.PageFactory.WebPage;
import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class WebpageFlow {
	
	private BaseTest objBaseTest;
	private SeleniumWrapperFunction objSeleniumWrapperFunction;
	private WebPage objWebPage;
	
	public WebpageFlow(BaseTest baseTest){
		
		this.objBaseTest = baseTest;
		objWebPage = new WebPage(objBaseTest);
		
		
	}
	
	/*public void displayWebpage()
	{
		objWebPage.verifyWebPageIsDisplayed();
		
	}*/
	

}
