package com.MyProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;

public class UserListPage extends BasePage
{
	@FindBy(xpath="//input[@value='Add New User']")
	private WebElement clickOnAddNewUser;
	
	@FindBy(className="successmsg")
	private WebElement successmessage;
	
	@Test
	public UserListPage()
	{
		PageFactory.initElements(BaseTestScript.driver, this);
	}
	@Test
	public void clickOnAddNewUser()
	{
		clickOnAddNewUser.click();
		
	}
	@Test
	public String getSuccessMsg()
	{
		return successmessage.getText();
	}
  
}
