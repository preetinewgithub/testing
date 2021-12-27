package com.test;

import org.testng.annotations.Test;

public class TestClass {
	@Test(groups="RegressionTest")
	public void regressionTest1()
	{
		System.out.println("Regression Test 1");
		
	}
	
	
	@Test(groups="RegressionTest")
	public void regressionTest2()
	{
		System.out.println("Regression test 2");
	}
	
	
	@Test(groups="SmokeTest")
	public void smokeTest1()
	{
		System.out.println("Smoke test 1");
	}
	
	@Test(groups="SmokeTest")
	public void smokeTest2()
	{
		System.out.println("Smoke test 2");
	}

}
