package com.generic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUtility {
	
	// 1 : Create work book
	private static XSSFWorkbook workbook;
	// 2: create for get sheet
	private static XSSFSheet excelSheet;
	// 3: create for get row
	private static XSSFRow row;
	// 4: create for get cell
	private static XSSFCell cell;



	public static void loadExcelFile(String ExcelFilePath ,String strSheetName)
	{
	try
	{
	FileInputStream excelFile =new FileInputStream(ExcelFilePath);
	workbook = new XSSFWorkbook(excelFile);
	excelSheet = workbook.getSheet(strSheetName);
	}catch(Exception exception)
	{
	System.out.println("While Loading Excel getting Error"+exception.getMessage());
	exception.printStackTrace();
	}
	}



	public static String getCellDataFromExcel(int rownum, int cellNum) {
	try
	{
	cell =excelSheet.getRow(rownum).getCell(cellNum);
	String strCellData=cell.getStringCellValue();
	return strCellData;

	}catch(Exception exception)
	{
	System.out.println("While Loading Excel getting Error"+exception.getMessage());
	exception.printStackTrace();
	return "";
	}
	}
	

}
