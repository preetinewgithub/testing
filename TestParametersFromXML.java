package com.parametirzation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersFromXML {
	
	
	@Parameters({"Suite-level-param"})
	@Test
	public void firstTest(String parameter){
		
		System.out.println(parameter);
		
	}
	
	@Parameters({"test-level-param"})
	@Test
	public void secondTest(String parameter){
		
		System.out.println(parameter);
		
	}
	
	@Parameters({"Suite-level-param", "test-level-param1"})
	@Test
	public void thirdTest(String suiteparameter, String testparameter){
		
		System.out.println(suiteparameter+"***"+testparameter);
		
	}

}
