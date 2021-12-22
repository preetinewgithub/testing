package com.Scripts;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.PageFactory.OrangeHRMPage;
import com.generic.BaseTest;
import com.generic.Utilities;

public class OrangeHRMTest extends BaseTest
{
	static WebDriver driver =null;
	OrangeHRMPage objOrangeHRMPage;
	Utilities objUtilities;
	
	
	@Test(priority=1)
	public void beforeMainMethod()
	{
		this.initializedWebEnvironment();
		objOrangeHRMPage = new OrangeHRMPage(this);
		objUtilities = new Utilities();
	}
	
	/*@Test(priority=1)
	public void TCID_01verifyPageTitle()
	{
		objOrangeHRMPage.verifyTitleOfPage();
	}*/
	
	@Test(priority=2)
	public void TCID_02testUserNameOption()
	{
		objOrangeHRMPage.setUsernameInOrangeHRMPage();
		
	}
	@Test(priority=3)
	public void TCID_03testPasswordOption()
	{
		objOrangeHRMPage.setPasswordInOrangeHRMPage();
	}
	@Test(priority=4)
	public void TCID_04clickLoginButton() throws InterruptedException
	{
		objOrangeHRMPage.clickLoginbutton();
		Thread.sleep(3000);
	}
	
	
}
