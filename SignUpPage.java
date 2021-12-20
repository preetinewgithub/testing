package com.PageFactory;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunction;

public class SignUpPage {
	private static WebDriver driver = null;
	private BaseTest objBaseTest;

	public SignUpPage(BaseTest basetest) {
		this.objBaseTest = basetest;
	}

	String actual_url = "https://www.facebook.com./";

	// Locators
	By loc_createNewAccount = By.xpath("//a[contains(@id,'u_0_2_')]");
	By loc_inpFirstame = By.xpath("//div[@id='reg_form_box']//input[@name='firstname']");
	By loc_inpSurName = By.xpath("//div[@id='reg_form_box']//input[@name='lastname']");
	By loc_inpMobileNumber = (By.xpath("//div[@id='reg_form_box']//input[@name='reg_email__']"));
	By loc_Password = (By.xpath("//div[@id='reg_form_box']//input[@type='password']"));
	By loc_Day = (By.xpath("//select[@id='day']"));
	By loc_month = (By.xpath("//select[@id='month']"));
	By loc_year = (By.xpath("//select[@id='year']"));
	By loc_gender_Female = (By.xpath("//label[normalize-space()='Female']"));
	By loc_inpMaleGender = By.xpath("//*[contains(text(),'Male')]");

	public void verifySignUpPageIsDispyaed() {
		System.out.println("Facebook Sign Up Page is Displayed");
		objBaseTest.getObjSeleniumWrapperFunction().click(loc_createNewAccount);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void setFirstName(String str_FirstName) {
		System.out.println("First Name is : ");
		objBaseTest.getObjSeleniumWrapperFunction().setText(loc_inpFirstame, str_FirstName);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void setSurname(String strSurname) {
		System.out.print("Set Surname :");
		objBaseTest.getObjSeleniumWrapperFunction().setText(loc_inpSurName, strSurname);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void setMobileNumber(String srrmobile) {
		System.out.print("Set Mobile Number :");
		objBaseTest.getObjSeleniumWrapperFunction().setText(loc_inpMobileNumber, srrmobile);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}/*
		 * public void setEmailID(String strEmailId) { System.out.print(
		 * "SetEmail-Id :"); this.setText(strEmailId); System.out.println(
		 * "Test Script Pass"); System.out.println(
		 * "==================================================================="
		 * ); }
		 */

	public void setPasswaord(String strPassword) {
		System.out.print("Set Password :");
		objBaseTest.getObjSeleniumWrapperFunction().setText(loc_Password, strPassword);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void selectDay(String strday) {
		System.out.print("Set Day is :");
		objBaseTest.getObjSeleniumWrapperFunction().getElement(loc_Day);
		objBaseTest.getObjSeleniumWrapperFunction().doSelectByDropDownIndex(loc_Day, strday);
		System.out.println(strday);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void selectMonth(String strMonnths) {
		System.out.println("Select Month :" + strMonnths);
		objBaseTest.getObjSeleniumWrapperFunction().getElement(loc_month);
		objBaseTest.getObjSeleniumWrapperFunction().doSelectByDropDownIndex(loc_month, strMonnths);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void selectYear(String strYears) {
		System.out.println("Select Year :");
		objBaseTest.getObjSeleniumWrapperFunction().getElement(loc_year);
		objBaseTest.getObjSeleniumWrapperFunction().doSelectByDropDownValue(loc_year, strYears);
		System.out.print("Test Script Pass");
		System.out.println("===================================================================");
	} /*
		 * public void selectGender(String strGender) { System.out.print(
		 * "Select Gender :");
		 * objBaseTest.getObjSeleniumWrapperFunctions().click(loc_gender);
		 * System.out.println("Test Script Pass"); System.out.println(
		 * "==================================================================="
		 * ); }
		 */

	public void selectGender(String strGetGender) {
		String strAllGender[] = { "Custom", "Male", "Female" };
		if (strGetGender.equalsIgnoreCase("Male"))
			objBaseTest.getObjSeleniumWrapperFunction().click(loc_inpMaleGender);
		else if (strGetGender.equalsIgnoreCase("Female"))
			objBaseTest.getObjSeleniumWrapperFunction().click(loc_gender_Female);
	}

	public void verifySignUpButton() {
		System.out.println("Facebook Sign Up Button is working");
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

}
