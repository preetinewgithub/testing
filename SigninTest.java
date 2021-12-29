package com.Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Flows.AddToCartFlow;
import com.Flows.SigninFlow;
import com.Flows.WebpageFlow;
import com.PageFactory.MyAccountPage;
import com.PageFactory.SigninPage;
import com.PageFactory.TshirtsPage;
import com.PageFactory.WebPage;
import com.generic.BaseTest;
import com.generic.CustomListeners;


@Listeners(CustomListeners.class)

public class SigninTest extends BaseTest {
	
	private SigninPage objSigninPage;
	private SigninFlow objSigninFlow;
	private WebPage objWebPage;
	private WebpageFlow objWebPageFlow;
	private MyAccountPage objMyAccountPage;
	private AddToCartFlow objAddToCartFlow;
	private TshirtsPage objTshirtsPage;
	
	public void initializeWebPagesAndFlow()
	{
		objSigninPage = new SigninPage(this);
		objSigninFlow = new SigninFlow(this);
		objWebPage = new WebPage(this);
		objWebPageFlow = new WebpageFlow(this);
		objMyAccountPage = new MyAccountPage(this);
		objAddToCartFlow = new AddToCartFlow(this);
		objTshirtsPage = new TshirtsPage(this);
	}
	
	@BeforeClass
	public void initializePreRequisiteAndEnv()
	{
		this.initializedWebEnvironment();
		this.initializeWebPagesAndFlow();
	}
	
	@AfterClass
	public void afterMethodWebEnv() 
	{
		this.tearDown();
	}
	
	/*@Test(priority=1)
	public void TCID_001testWebPageDisplay()
	{
		objWebPageFlow.displayWebpage();
		objWebPage.verifyWebPageIsDisplayed();
	}*/
	
	@Test(priority=1)
	public void TCID_001testHomePageDisplay()
	{
		objSigninFlow.verifyHomePageIsDisplayed();
	}
	
	@Test(priority=2)
	public void tCID_002clickLoginButton()
	{
		objSigninFlow.clickLoginButton();
	}
	
	
	
	@Test(priority=3)
	public void TCID_003SigninSignoutFunctionality()
	{
		//objSigninFlow.verifyHomePageIsDisplayed();
		//objSigninPage.clickLoginButton();
		objSigninPage.verifySigninPageIsDisplayed();
		objSigninFlow.doSignin();
		
	}
	
	@Test(priority=4)
	public void TCID_004verifyMyAccountPageisDisplayed()
	{
		objMyAccountPage.verifyMyAccountPageisDisplayed();
	}
	
	@Test(priority=5)
	public void TCID_005addToCartTest()
	{
		objAddToCartFlow.addToCart();
	}
	
	/*@Test(priority=4)
	public void TCID_004VerifyAndGetAllLinksOnWebPage()
	{
		//objSigninPage.getAllLinksOnLoginPage();
		
		
	}*/
	
	@Test(priority=6)
	public void TCID_006verifyAllBrokenLinks()
	{
		objSigninPage.verifyAllBrokenLinks();
	}

}
