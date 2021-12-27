package com.generic;

public class TestExcelData {
	
	public static void main(String[] args)
	{
		
		ExcelReaderUtility.loadExcelFile(System.getProperty("user.dir")
				+ "/src/main/resources/resources/excel/Automation_external_TestData_input.xlsx", "TC_ID_01");
				String strTestData = "";

				for (int intRow = 0; intRow < 4; intRow++)
				{
				for (int intCol = 0; intCol < 4; intCol++)
				{
				strTestData = ExcelReaderUtility.getCellDataFromExcel(intRow, intCol);
				System.out.println("Print Test Data :" + strTestData);
				}
				}

				System.out.println("--------------------------------------------------------------------");
				System.out.println("-----EcelData-------"+ExcelReaderUtility.getCellDataFromExcel(2, 2));
				}


		
	}


