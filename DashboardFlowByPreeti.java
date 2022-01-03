package com.flows;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.flows.commonFlows.CommonFlow;
import com.generic.FileFunctions;
import com.generic.Pojo;
import com.pageFactory.DashboardPage;
import com.pageFactory.DashboardPageByPreeti;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageByPreeti;
import com.popupFactory.ConfirmLogOffPopUpPage;
import com.popupFactory.SelectRolePopUpPage;
import com.popupFactory.SelectRolePopUpPageByPreeti;

public class DashboardFlowByPreeti {
	
	// Global Variable
			private Pojo objPojo;
			private String strUniqueKey = "";
			private String testData = "", testData_2 = "";
			private Integer intTestData = null;
			private Integer intTestData_1 = null;
			private String strReturnVal = "";
			private String strReturnVal_1 = "";
			private int intReturnVal = 0;
			private boolean blnReturnStatus = false;
			private double dblReturnVal = 0.0;
			private List<WebElement> listReturnElement;
			private List<String> listReturnValue;
			private WebElement weReturnElement;
			private int intRow = 0;
			private int intColumn = 0;

			// Reference object of Pages
			private LoginPageByPreeti objLoginPageByPreeti;
			private CommonFlow objCommonFlow;
			private SelectRolePopUpPageByPreeti objSelectRolePopUpPageByPreeti;
			private DashboardPageByPreeti objDashboardPageByPreeti;
			private ConfirmLogOffPopUpPage objConfirmLogOffPopUpPage;

			// Constructor of class
			public DashboardFlowByPreeti(Pojo pojo) {
				this.objPojo = pojo;
				objLoginPageByPreeti = new LoginPageByPreeti(objPojo);
				objCommonFlow = new CommonFlow(objPojo);
				objSelectRolePopUpPageByPreeti = new SelectRolePopUpPageByPreeti(objPojo);
				objDashboardPageByPreeti = new DashboardPageByPreeti(objPojo);
				objConfirmLogOffPopUpPage = new ConfirmLogOffPopUpPage(objPojo);
			}
			
			public void verifyAllMenuItemsListOnDashboard()
			{
				try {
				 	listReturnValue =	FileFunctions.readFileIntoList(System.getProperty("user.dir")+"/src/test/resources/testData/textFiles/TCID_1_MenuItemList.txt");
				 	for (String strValue : listReturnValue) {
						System.out.println("text file testData : "+strValue);
					}
	
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if(objDashboardPageByPreeti.isMenuItemIconIsDisplayed())
					objDashboardPageByPreeti.clickMenuItemIconOnDashboard();
				for (int index = 0; index < listReturnValue.size(); index++) {
					String strMenuItemName = listReturnValue.get(index).trim();
					if(!strMenuItemName.equals("")){
						objPojo.getObjWrapperFunctions().waitFor(1);
						objDashboardPageByPreeti.verifyAllMenuItemsIsDisplayedOnDashboardPage(strMenuItemName);
					}
				}
			}
				
				
			}
			
	
	
	
	
	
	
	
	
	
	
	
	
	


