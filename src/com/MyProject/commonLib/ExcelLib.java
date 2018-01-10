package com.MyProject.commonLib;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.testng.annotations.Test;

public class ExcelLib 
{
  
  public static String getCellData(String xlpath,String sheename, int rownum,int cellnum) throws Exception
  {
	  try
	  {
	  FileInputStream fis = new FileInputStream(xlpath);
	  Workbook w1 = WorkbookFactory.create(fis);
	  String data = w1.getSheet(sheename).getRow(rownum).getCell(cellnum).getStringCellValue();
	  return data;
	  }
	  catch(Exception e)
	  {
		  return " ";
	  }
  }
  public static void setCellData(String xlpath,String sheetname,int rownum,int cellnum,String data) throws Exception
  {
	  try
	  {
		  FileInputStream fis = new FileInputStream(xlpath);
		  Workbook w1 = WorkbookFactory.create(fis);
		  w1.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(data);
		  FileOutputStream fos = new FileOutputStream(xlpath);
		  w1.write(fos);
	  }
	  catch(Exception e)
	  {
		  return;
	  }
  }
}
