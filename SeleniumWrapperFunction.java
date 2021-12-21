package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunction {

	private static BaseTest objBaseTest;

	public SeleniumWrapperFunction(BaseTest basetest) {
		this.objBaseTest = basetest;
	}

	public boolean setText(By locator, String strInputValue) {
		try{
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		return true;
		}
		catch(Exception exception){
		System.out.println("I got exception :"+exception.getMessage());
		exception.printStackTrace();
		return false;
		}

	}
	
	public String getText(By locator)
	{
		try {
		String strReturnValue =	objBaseTest.getDriver().findElement(locator).getText();
		return strReturnValue;
			
		} catch (Exception exception) {
			System.out.println("I got exception :"+exception.getMessage());
		}
		return null;
	}
	
	public boolean dragAndDrop(By fromLocator, By toLocator)
	{
		try {
			WebElement from = objBaseTest.getDriver().findElement(fromLocator);
			
			 this.setExplicitlyWait(5);
			WebElement to = objBaseTest.getDriver().findElement(toLocator);
			
			Actions act = new Actions(objBaseTest.getDriver());
			
			act.dragAndDrop(from, to).build().perform();
			return true;
			
		} catch (Exception exception)
		{
			System.out.println("I got exception : "+exception.getMessage());
			exception.getStackTrace();
		
		return false;
		}
		
	}
	
	/*public boolean click(By locator) {
		try{
		objBaseTest.getDriver().findElement(locator).click();
		return true;
		}
		catch(Exception exception)
		{
        System.out.println("I got exception : "+exception.getMessage());
        exception.printStackTrace();
        return false;
	}
	}*/
	
	public boolean click(By locator) {

		try {
			objBaseTest.getDriver().findElement(locator).click();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}
	
	public void setExplicitlyWait(int intTimeUnitInSecond)
	{
		
	}
	public boolean goBack()
	{
		try {
			objBaseTest.getDriver().navigate().back();
			return true;
			
		} catch (Exception exception) {
			System.out.println("I got exception :"+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	
	public boolean selectDropDown(By locator, String strDropdownOption, String strOptionType) {
		try {
			if(strOptionType.equals("Text"))
			{
			WebElement dropDown = objBaseTest.getDriver().findElement(locator);
			Select selectDropDown = new Select(dropDown);
			selectDropDown.selectByVisibleText(strDropdownOption);
			
		}else if(strOptionType.equals("Value"))
		{
			WebElement dropDown = objBaseTest.getDriver().findElement(locator);
			Select selectDropDown = new Select(dropDown);
			selectDropDown.selectByVisibleText(strDropdownOption);
			
		}else if(strOptionType.equals("Index"))
		{
			WebElement dropDown = objBaseTest.getDriver().findElement(locator);
			Select selectDropDown = new Select(dropDown);
			selectDropDown.selectByVisibleText(strDropdownOption);
			
		}
			return true;

	}
			
		catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	
	}
	
	
	
	
	
	
	

	public static WebElement getElement(By Locator) {
		return objBaseTest.getDriver().findElement(Locator);

	}

	public static void doSelectByVisibleText(By Locator, String value) {
		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(value);
	}

	public static void doSelectByDropDownIndex(By Locator, String strday) {
		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(strday);
	}

	public static void doSelectByDropDownValue(By Locator, String value) {
		Select select = new Select(getElement(Locator));
		select.selectByValue(value);
	}

	
}
