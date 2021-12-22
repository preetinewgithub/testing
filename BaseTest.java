package com.generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private static WebDriver driver = null;
    private String strurl = "https://opensource-demo.orangehrmlive.com";
	// create reference object of objSeleniumWrapperFunction
	private SeleniumWrapperFunction objSeleniumWrapperFunction;

	public void initializedWebEnvironment() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIFUL\\workspace\\OrangeHRm\\externalresources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		objSeleniumWrapperFunction = new SeleniumWrapperFunction(this);
		this.setObjSeleniumWrapperFunction(objSeleniumWrapperFunction);
		driver.get(strurl);
		System.out.println("open URL :" + strurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public WebDriver getDriver() {
		return driver;
	}

	public SeleniumWrapperFunction getObjSeleniumWrapperFunction() {
		return objSeleniumWrapperFunction;
	}

	public void setObjSeleniumWrapperFunction(SeleniumWrapperFunction objSeleniumWrapperFunction) {
		this.objSeleniumWrapperFunction = objSeleniumWrapperFunction;
	}

	/*public void tearDown() {
		{
			driver.close();
			System.out.println("Close The Browser ");
			System.out.println("===================================================================");
		}*/
	}


