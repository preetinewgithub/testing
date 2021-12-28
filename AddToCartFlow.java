package com.Flows;

import java.util.Hashtable;

import com.PageFactory.MyAccountPage;
import com.PageFactory.SigninPage;
import com.PageFactory.TshirtsPage;
import com.PageFactory.WebPage;
import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class AddToCartFlow 

{
	
	private BaseTest objBaseTest;
	private SeleniumWrapperFunction objSeleniumWrapperFunction;
	private SigninPage objSigninPage;
	private WebPage objWebPage;
	private MyAccountPage objMyAccountPage;
	private TshirtsPage objTshirtsPage;
	
public AddToCartFlow(BaseTest baseTest){
		
		this.objBaseTest = baseTest;
		objSigninPage = new SigninPage(objBaseTest);
		objWebPage = new WebPage(objBaseTest);
		objMyAccountPage = new MyAccountPage(objBaseTest);
		objTshirtsPage = new TshirtsPage(objBaseTest);
		
		
	}

      public void addToCart()
      {
    	  objMyAccountPage.moveToWomenOnMyAccountPage(); 
    	  objMyAccountPage.clickTshirtsOnMyAccountPage();
    	  objTshirtsPage.verifyTshirtsPageIsDisplayed();
    	  objTshirtsPage.moveToShortSleevTshirtOnTshirtPage();
    	  objTshirtsPage.clickBtnAddToCart();
    	  
      }

    
    
    
    
    

}
