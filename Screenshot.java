package com.Scripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.CustomListeners;



//@Listeners(CustomListeners.class)




public class Screenshot extends BaseTest {
	
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initializedWebEnvironment();
	}



	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}




	@Test
	public void takeScreenshotTest1()
	{
	Assert.assertEquals(false,true);
	}
	}
	
	
	
	


