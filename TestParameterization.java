package com.parametirzation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization
{
	
	@Test(dataProvider="getData")
	public void doSignIn(String strUsername,String strPassword)
	{
	System.out.println("Username:"+strUsername+"Password:"+strPassword);
	}

	@DataProvider
	public Object[][] getData(){
	Object[][] data=new Object[3][2];

	data[0][0]="Preeti11@gmail.com";
	data[0][1]="Welcome";

	data[1][0]="Preeti22@gmail.com";
	data[1][1]="Welcome2022";

	data[2][0]="Preeti33@gmail.com";
	data[2][1]="Bye";


	return data;

	}

	

}
