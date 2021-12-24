package com.generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private static WebDriver driver = null;
	public Properties objConfig;
	public String strurl = "";
    //private String strurl = "http://automationpractice.com/index.php";
	// create reference object of objSeleniumWrapperFunction
	private SeleniumWrapperFunction objSeleniumWrapperFunction;
	
	

	

	public void initializedWebEnvironment() {
		
		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		objSeleniumWrapperFunction = new SeleniumWrapperFunction(this);
		this.setObjSeleniumWrapperFunction(objSeleniumWrapperFunction);
		strurl=objConfig.getProperty("AUT_URL");
		driver.get(strurl);
		System.out.println("open URL :" + strurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Title:"+driver.getTitle());
		System.out.println("Current url:"+driver.getCurrentUrl());
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

	public void tearDown() {
		{
			driver.close();
			System.out.println("Close The Browser ");
			System.out.println("===================================================================");
		}
	}
	
	//Reusable generic method 
	public void loadConfigProperties()
	{
		try {
			objConfig = new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties"));
			
		} catch (Exception exception) {
			System.out.println("I got Exception :"+exception.getMessage());
			exception.printStackTrace();
			// TODO: handle exception
		}
	}

}
