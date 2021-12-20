package com.Scripts;


	
	import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageFactory.SignUpPage;
import com.generic.BaseTest;
	import com.generic.SeleniumWrapperFunction;
	import com.generic.Utilities;



	public class SignUpTest extends BaseTest{
	static WebDriver driver =null;
	SignUpPage objSignUpPage;
	Utilities objUtilities;
	
	@BeforeClass
	public void beforeMainMethod()
	{
		this.initializedWebEnvironment();
		objSignUpPage = new SignUpPage(this);
		objUtilities = new Utilities();

	}
	@AfterMethod
	public void afterMethod()
	{
	this.tearDown();

	}
	
    @Test
	public void TCID001_FbSignUp(){
	Utilities objUtilities = new Utilities();
	objSignUpPage.verifySignUpPageIsDispyaed();
	String strFirstNmae = objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(4);
	objSignUpPage.setFirstName(strFirstNmae);

	String strSurNmae = objUtilities.getRandomSurname()+objUtilities.getRandomStrings(4);
	objSignUpPage.setSurname(strSurNmae);

	String strMobile = objUtilities.getRandomMobile_Number()+objUtilities.getRandomMobile(7);
	objSignUpPage.setMobileNumber(strMobile);

	String strPasswaord=objUtilities.getRandomPassword();
	objSignUpPage.setPasswaord(strPasswaord);

	//String strDay=objSignUpPage.selectDay(7)+objUtilities.getRandomDay();
	String strday=objUtilities.getRandomDay();
	objSignUpPage.selectDay(strday);

	//String strMonth=objUtilities.getRandomMonths();
	//objSignUpPage.selectMonth(strMonth);
	String strMonth=objUtilities.GetBirthMonth();
	System.out.println(strMonth);
	objSignUpPage.selectMonth(strMonth);

	String strYear=objUtilities.getBirthYear();
	objSignUpPage.selectYear(strYear);

	String strGender=objUtilities.getGender();
	System.out.println(strGender);
	objSignUpPage.selectGender(strGender);
	}
	
	



	//public static void main(String[] args) {

	//Utilities objUtilities = new Utilities();
	//SignUpTest objSignupTest=new SignUpTest();
	//objSignupTest.beforeMainMethod();

	/*objSignUpPage.verifySignUpPageIsDispyaed(driver);
	String strFirstNmae = objUtilities.getRandomStrings(7);
	objSignUpPage.setFirstName(strFirstNmae,driver);
	String strSurNmae = objUtilities.getRandomSurname()+objUtilities.getRandomStrings(4);
	objSignUpPage.setSurname(strSurNmae,driver);
	String stremailid=objUtilities.getRandomStrings(4)+objUtilities.getRandomEmaiId();
	objSignUpPage.setEmailID(stremailid);


	String srrmobile=objUtilities.getRandomMobile_Number()+objUtilities.getRandomMobile(7);
	objSignUpPage.setMobileNumber(srrmobile,driver);
	String strPassword = objUtilities.getRandomPassword();
	objSignUpPage.setPasswaord(strPassword,driver);



	int strDay = Utilities.getRandomDay();
	objSignUpPage.selectDay(strDay);



	String strMonth = objUtilities.getRandomMonths();
	objSignUpPage.selectMonth(strMonth);



	// -----------------------------------



	int strYear = Utilities.getRandomYear();
	objSignUpPage.selectYear(strYear);



	// -----------------------------------



	String strGender = objUtilities.getRandomGender();
	objSignUpPage.selectGender(strGender);

	objSignUpPage.verifySignUpButton();
	//objBaseTest.tearDown();

	*/
	}




	




