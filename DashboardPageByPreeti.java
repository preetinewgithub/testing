package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.Pojo;

public class DashboardPageByPreeti {
	
	// Global Variables
		private Pojo objPojo;
		private String strUniqueKey = "";
		private String testData = "", testData_2 = "";
		private Integer intTestData = null;
		private String strReturnVal = "";
		private int intReturnVal = 0;
		private boolean blnReturnStatus = false;
		private double dblReturnVal = 0.0;
		private List<WebElement> listReturnElement;
		private WebElement weReturnElement;
		private int intRow = 0;
		private int intColumn = 0;

		public DashboardPageByPreeti(Pojo pojo) {
			this.objPojo = pojo;
		}
		
		//Locators
		By loc_userIcon= By.xpath("//div[@class='hero-img img-circle pull-left']/img[@title='eMedicareSync']");
		By loc_lnkLogOff=By.xpath("//a[text()='Log off']");
		By loc_iconMenuItem = By.xpath("//ul[@id='menu']/li[@class='sidebar-toggle']/div[@class='navbar-toggle']");
		
		
		
		
		public void clickOnUserIcon()
		{
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_userIcon);
			objPojo.getObjUtilities().logReporter("click on 'User Icon' button", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_userIcon));
			
		}
		
		public void clickOnLogOff()
		{
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_lnkLogOff);
			objPojo.getObjUtilities().logReporter("Click on 'Log Off' link to Logout", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_lnkLogOff));
		}
		
		public boolean isMenuItemIconIsDisplayed(){
			
		return	objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_iconMenuItem);
		
		}
		
		public void clickMenuItemIconOnDashboard(){
			objPojo.getObjUtilities().logReporter("click Menu Item Icon On Dashboard Page", objPojo.getObjWrapperFunctions().click(loc_iconMenuItem));
			
			
			
		}
		
		public void verifyAllMenuItemsIsDisplayedOnDashboardPage(String strMenuItemName)
		{
			By locator = By.xpath("//span[contains(text(),'"+strMenuItemName+"')]");
			objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
			objPojo.getObjUtilities().logReporter("verify menu item : '"+strMenuItemName+"' is displayed on Dashboard .", objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
			
			
		}
		
		public void clickOnMenuItemFromLeftSideBarMenu(String strMenuItemName) {
			By locator = By.xpath("//span[contains(text(),'"+strMenuItemName+"')]");
			objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
			objPojo.getObjUtilities().logReporter("Verify user can click on menu item list",
					"User should be able to click on menu item '"+strMenuItemName+"'",
					"User is able to click on menu item '"+strMenuItemName+"'", 
					objPojo.getObjWrapperFunctions().click(locator));
		}
		
		
		
		
	
	
	

}
