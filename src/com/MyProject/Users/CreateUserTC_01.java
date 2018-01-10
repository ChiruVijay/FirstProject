package com.MyProject.Users;

import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;
import com.MyProject.commonLib.ExcelLib;
import com.MyProject.commonLib.ValidationLib;
import com.MyProject.pages.AddNewUser;
import com.MyProject.pages.BasePage;
import com.MyProject.pages.LoginPage;
import com.MyProject.pages.UserListPage;

public class CreateUserTC_01 extends BaseTestScript
{
	@Test
	public void testCreateUserTC_01() throws Exception
	{
		String path = "./testdata/Mydata.xlsx";
		String username = ExcelLib.getCellData(path, "TC_01", 1, 0);
		String password = ExcelLib.getCellData(path, "TC_01", 1, 1);
		String retypepwd = ExcelLib.getCellData(path, "TC_01", 1, 2);
		String firstname = ExcelLib.getCellData(path, "TC_01", 1, 3);
		String lastname = ExcelLib.getCellData(path, "TC_01", 1, 4);
		String expres = ExcelLib.getCellData(path, "TC_01", 1, 5);
		
		LoginPage ln = new LoginPage();
		BasePage bp = new BasePage();
		UserListPage ulp = new UserListPage();
		AddNewUser anu = new AddNewUser();
		
		ln.enterUserName("admin");
		ln.enterPassWord("manager");
		ln.ClickOnSubmit();
		bp.clickOnUser();
		ulp.clickOnAddNewUser();
		anu.Enterusername(username);
		
		anu.Enterpassword(password);
		anu.EnterRetypepwd(retypepwd);
		anu.EnterFirstname(firstname);
		anu.EnterLastname(lastname);
		anu.ClickOnCreateUser();
		
		
		String actres = ulp.getSuccessMsg();
		
		ExcelLib.setCellData(path, "TC_01", 1, 6, actres);
		
		ValidationLib.verifySuccessMsg(expres, actres, path, "TC_01", 1, 7);
		
		
		
		
		
		
		
	}
	
  
}
