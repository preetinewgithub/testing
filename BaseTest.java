package com.pralleltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	
	public WebDriver getDriver(String browser)
	{
	if(browser.equals("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}else if(browser.equals("firefox"))
	{
	WebDriverManager.firefoxdriver().setup();
	driver =new FirefoxDriver();
	}
	else if(browser.equals("iedriver"))
	{
	WebDriverManager.iedriver().setup();
	driver = new InternetExplorerDriver();
	}
	return driver;
	}



	}
	
	
	
	
	
	
	
	


