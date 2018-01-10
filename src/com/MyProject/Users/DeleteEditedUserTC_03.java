package com.MyProject.Users;

import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;
import com.MyProject.commonLib.ExcelLib;
import com.MyProject.commonLib.ValidationLib;
//import com.MyProject.pages.AddNewUser;
import com.MyProject.pages.BasePage;
import com.MyProject.pages.DeleteUser;
import com.MyProject.pages.EditUserPage;
import com.MyProject.pages.LoginPage;
import com.MyProject.pages.UserListPage;

public class DeleteEditedUserTC_03 extends BaseTestScript
{
	@Test
	public void testDeleteEditedUserTC_03() throws Exception
	{
	String path = "./testdata/deleteuser.xlsx";
	
	String expres = ExcelLib.getCellData(path, "TC_03", 1, 0);
	
	LoginPage ln = new LoginPage();
	BasePage bp = new BasePage();
	UserListPage ulp = new UserListPage();
	//AddNewUser anu = new AddNewUser();
	//EditUserPage eup = new EditUserPage();
	DeleteUser du = new DeleteUser();
	
	ln.enterUserName("admin");
	ln.enterPassWord("manager");
	ln.ClickOnSubmit();
	bp.clickOnUser();
	du.clickonuser();
	du.deleteUser();
	String actres = ulp.getSuccessMsg();
	
	ExcelLib.setCellData(path, "TC_03", 1, 1, actres);
	
	ValidationLib.verifySuccessMsg(expres, actres, path, "TC_03", 1, 2);
	
	
	}
  
}
