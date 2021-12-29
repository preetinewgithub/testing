package com.generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends BaseTest implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Failed Test");
		failedTestCases(result.getMethod().getMethodName());

		String testMethodName=result.getMethod().getMethodName();
		System.out.println(testMethodName);



		try {
		getScreenShotPath(testMethodName);
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	
		/*System.out.println("Failed Test");
		failed(result.getMethod().getMethodName());*/


		
	}

	private void failedTestCases(String methodName) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
