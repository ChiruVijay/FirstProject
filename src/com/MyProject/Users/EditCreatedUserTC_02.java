package com.MyProject.Users;

import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;
import com.MyProject.commonLib.ExcelLib;
import com.MyProject.commonLib.ValidationLib;
import com.MyProject.pages.AddNewUser;
import com.MyProject.pages.BasePage;
import com.MyProject.pages.EditUserPage;
import com.MyProject.pages.LoginPage;
import com.MyProject.pages.UserListPage;

public class EditCreatedUserTC_02 extends BaseTestScript
{
	@Test
	public void testEditCreatedUserTC_02() throws Exception
	{
		String path = "./testdata/edituserdata.xlsx";
		String editlastname = ExcelLib.getCellData(path, "TC_02", 1, 4);
		String expres = ExcelLib.getCellData(path, "TC_02", 1, 5);
		
		LoginPage ln = new LoginPage();
		BasePage bp = new BasePage();
		UserListPage ulp = new UserListPage();
		AddNewUser anu = new AddNewUser();
		EditUserPage eup = new EditUserPage();
		
		ln.enterUserName("admin");
		ln.enterPassWord("manager");
		ln.ClickOnSubmit();
		bp.clickOnUser();
		eup.clickOnCretedUser();
		eup.reEnetrLastname(editlastname);
		anu.EnterLastname(editlastname);
		eup.workDuration();
		eup.clickSaveChange();
		String actres = ulp.getSuccessMsg();
		
		ExcelLib.setCellData(path, "TC_02", 1, 6, actres);
		
		ValidationLib.verifySuccessMsg(expres, actres, path, "TC_02", 1, 7);
		
		
	}
 
}
