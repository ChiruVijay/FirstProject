package com.MyProject.commonLib;

import org.testng.Assert;
//import org.testng.annotations.Test;

public class ValidationLib
{
	public static void verifySuccessMsg(String expres,String actres,String path,String sheetname,int rownum,int cellnum) throws Exception
	{
		try
		{
		Assert.assertEquals(expres, actres);
		ExcelLib.setCellData(path, sheetname, rownum, cellnum, "PASS");
		}
		catch(Exception e)
		{
			ExcelLib.setCellData(path, sheetname, rownum, cellnum, "FAIL");
		}
	}
	
  
}
