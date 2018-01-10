package com.MyProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;

public class AddNewUser extends BasePage
{
	@FindBy(name="username")
	private WebElement usertxt;
	
	@FindBy(name="passwordText")
	private WebElement pwdtext;
	
	@FindBy(name="passwordTextRetype")
	private WebElement retypepwdtext;
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickOnCreateUser;
	
	
	@Test
	public AddNewUser()
	{
		PageFactory.initElements(BaseTestScript.driver, this);
	}
	@Test
	public void Enterusername(String un)
	{
		usertxt.sendKeys(un);
	}
	@Test
	public void Enterpassword(String pwd)
	{
		pwdtext.sendKeys(pwd);
		
	}
	@Test
	public void EnterRetypepwd(String retypePwd)
	{
		retypepwdtext.sendKeys(retypePwd);
	}
	
	@Test
	public void EnterFirstname(String fn)
	{
		firstname.sendKeys(fn);
	}
	
	@Test
	public void EnterLastname(String ln)
	{
		lastname.sendKeys(ln);
	}
	@Test
	public void ClickOnCreateUser()
	{
		clickOnCreateUser.click();
	}
	
}
