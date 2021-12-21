package com.HerokuAppScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.HerokuApp.PageFacotry.HerokuAppPage;
import com.PageFactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.Utilities;

public class HerokuAppTest extends BaseTest {
	static WebDriver driver =null;
	HerokuAppPage objHerokuAppPage;
	Utilities objUtilities;
	
	@BeforeClass
	public void beforeMainMethod()
	{
		this.initializedWebEnvironment();
		objHerokuAppPage = new HerokuAppPage(this);
		objUtilities = new Utilities();
	}
	
	//@AfterMethod
	/*public void afterMethod()
	{
	this.tearDown();

	}*/
	
	
	@Test(priority=1)
	public void TCID001_verifyHerokuAppPage()
	{
		objHerokuAppPage.verifyHerokuAppPage();
	}
	
	@Test(priority=2)
	public void TCID002_testClickABTesting()
	{
		Utilities objUtilities = new Utilities();
		objHerokuAppPage.clickABTesting();
		
	}
	@Test(priority=3)
	public void TCID003_testGoBack()
	{
		objHerokuAppPage.goBack();
	}
	@Test(priority=4)
	
	public void TCID_004testBasicAuth()
	{
		objHerokuAppPage.clickBasicAuth();
	}
	@Test(priority=5)
	public void TCID004_testGoBack()
	{
		objHerokuAppPage.goBack();
	}
	@Test(priority=6)
	public void TCID005_testDropdown() throws Throwable
	{
		String strRandomOption = objUtilities.GetRandomOption();
		objHerokuAppPage.clickDropdown(strRandomOption);
		Thread.sleep(5000);
	
	}
	
	
	
	

}
