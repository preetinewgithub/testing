package com.scripts.login;

import java.lang.reflect.Method;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flows.LoginLogoutFlow;
import com.flows.LoginLogoutFlowByPreeti;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageByPreeti;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class LoginLogoutTestByPreeti extends BaseTest
{


	// Global variables
	private CommonFlow objCommonFlow;
	private LoginPageByPreeti objLoginPageByPreeti;
	private LoginLogoutFlowByPreeti objLoginLogoutFlowByPreeti;
	private String testCaseID="";

	
	// Initialize Flows
		public void initializeFlowsAndPages() {
			objCommonFlow = new CommonFlow(this);
			objLoginPageByPreeti=new LoginPageByPreeti(this);
			objLoginLogoutFlowByPreeti = new LoginLogoutFlowByPreeti(this);
		}

		@BeforeClass(groups = { "P1", "P2", "P3" })
		public void initializeEnvironment() {
			this.initializeWebEnvironment("excel/PAE");
			this.initializeFlowsAndPages();
			/* Resource Name has to be before login */
			objCommonFlow.setResourceName("Khushbu Borole");
			// objLoginLogoutView.doLogin();
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
		
		/*@Title("TCID_101_VerifyLoginFunctionality")
		@Description("Verify user should login into the system")
		@Test(priority = 1, groups = { "P1" })
		public void TCID_101_VerifyLoginFunctionality() {
			this.loadTestData("TCID_101_VerifyLoginFunctionality");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPreeti.doLoginWithExcelParameter();
		}*/
		
		/*@Title("TCID_102_VerifyInvalidPasswordErrorMsg")
		@Description("Verify user should login into the system")
		@Test(priority = 1, groups = { "P1" })
		public void TCID_102_VerifyInvalidPasswordErrorMsg() {
			this.loadTestData("TCID_102_VerifyInvalidPasswordErrorMsg");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPreeti.doLoginWithExcelParameter();
		}*/
		
		/*@Title("TCID_103_VerifyInvalidUsernameErrorMsg")
		@Description("Verify user should login into the system")
		@Test(priority = 1, groups = { "P1" })
		public void TCID_103_VerifyInvalidUsernameErrorMsg() {
			this.loadTestData("TCID_103_VerifyInvalidUsernameErrorMsg");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPreeti.doLoginWithExcelParameter();
		}*/
		
		@Title("TCID_104_VerifyInvalidUsernameAndPasswordErrorMsg")
		@Description("Verify user should login into the system")
		@Test(priority = 1, groups = { "P1" })
		public void TCID_104_VerifyInvalidUsernameAndPasswordErrorMsg() {
			this.loadTestData("TCID_104_VerifyInvalidUsernameAndPasswordErrorMsg");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPreeti.doLoginWithExcelParameter();
		}
		
		
		
		
		
		
		
		/*@Title("TCID_105_VerifyErrorMsgIsDisplayedWithInvalidCredentials")
		@Description("Verify user should login into the system")
		@Test(priority = 1, groups = { "P1" })
		public void TCID_105_VerifyErrorMsgIsDisplayedWithInvalidCredentials() {
			this.loadTestData("TCID_105_VerifyErrorMsgIsDisplayedWithInvalidCredentials");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPreeti.doLoginWithExcelParameter();
			//objLoginPageByPreeti.verifyLoginFunctionalityWithInvalidCredentails("Invalid password...Try Again!!!");
			
		}*/
		
}
