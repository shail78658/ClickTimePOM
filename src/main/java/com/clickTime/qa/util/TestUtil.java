package com.clickTime.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.clickTime.qa.base.TestBase;
import com.google.common.io.Files;

public class TestUtil extends TestBase

{
	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 60;
	private static String TESTDATA_SHEET_PATH = "C:/Users/strivedi/Desktop/Week.xlsx";
//	static Workbook book;
//	static org.apache.poi.ss.usermodel.Sheet sheet;
//
//	
//	public static Object[][] getTestData(String sheetName) {
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream(TESTDATA_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			book = WorkbookFactory.create(file);
//		} catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sheet = book.getSheet(sheetName);
//		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		 System.out.println(sheet.getLastRowNum() + "--------" +
//		 sheet.getRow(0).getLastCellNum());
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//				 System.out.println(data[i][k]);
//			}
//		}
//		return data;
	


	public static void takeScreenshotAtEndOfTest() throws Exception
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		//FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		

       
		}


	}

