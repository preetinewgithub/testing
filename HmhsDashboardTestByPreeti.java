package com.scripts.dashboard;

import java.lang.reflect.Method;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flows.DashboardFlow;
import com.flows.DashboardFlowByPreeti;
import com.flows.LoginLogoutFlow;
import com.flows.LoginLogoutFlowByPreeti;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageByPreeti;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class HmhsDashboardTestByPreeti extends BaseTest {
	
	
	// Global variables
		private CommonFlow objCommonFlow;
		private LoginPageByPreeti objLoginPageByPreeti;
		private DashboardFlow objDashboardFlow;
		private LoginLogoutFlowByPreeti objLoginLogoutFlowByPreeti;
		private String testCaseID="";
		private DashboardFlowByPreeti objDashboardFlowByPreeti;

		// Initialize Flows
		public void initializeFlowsAndPages() {
			objCommonFlow = new CommonFlow(this);
			objLoginPageByPreeti=new LoginPageByPreeti(this);
			objLoginLogoutFlowByPreeti = new LoginLogoutFlowByPreeti(this);
			objDashboardFlowByPreeti = new DashboardFlowByPreeti(this);
		}

		@BeforeClass(groups = { "P1", "P2", "P3" })
		public void initializeEnvironment() {
			this.initializeWebEnvironment("excel/PAE");
			this.initializeFlowsAndPages();
			/* Resource Name has to be before login */
			objCommonFlow.setResourceName("Khushbu Borole");
			//objLoginLogoutFlow.doLogin();
		}

		@AfterClass(groups = { "P1", "P2", "P3" })
		public void tearDownEnvironment() {
			this.tearDownWebEnvironment();
			objCommonFlow = null;
			objLoginPageByPreeti=null;

		}
		
		@BeforeMethod(groups = { "P1", "P2", "P3" })
		public void redirect_Me_To_HomePage_On_SH_Application(Method method) {
			testCaseID = method.getName();
			this.startTestExecutionVideoRecording(testCaseID);
			this.getObjWrapperFunctions().waitFor(5);
			System.out.println("Video Recording Started ....!!");
		}
		
		@AfterMethod
		public void stopVideoRecording(){
			this.stopTestExecutionVideoRecording();
			this.getObjWrapperFunctions().waitFor(5);
			System.out.println("Video Recording Stopped ....!!");
		}
		
		@Title("TCID_01_VerifyMenuItemsListOnDashboard")
		@Description("To verify all the menu items in the left menu bar on Dashboard ")
		@Test(priority = 1, groups = { "P1" })
		public void TCID_01_VerifyMenuItemsListOnDashboard() {
			this.loadTestData("TCID_01_VerifyMenuItemsListOnDashboard");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPreeti.doLoginWithExcelParameter();
			objDashboardFlowByPreeti.verifyAllMenuItemsListOnDashboard();
		//	objDashboardFlow.clickOnMenuItemAndVerifyPageHeader();
			
		}
		
	
	
	
	
	
	
	

}
