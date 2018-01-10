package com.MyProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;

public class BasePage
{
	@FindBy(linkText="Users")
	private WebElement userbtn;
	
	@FindBy(className="logoutImg")
	private WebElement logoutbtn;
	
	@Test
	public BasePage()
	{
		PageFactory.initElements(BaseTestScript.driver, this);
	}
	
	@Test
	public void clickOnUser()
	{
		userbtn.click();
	}
	
	@Test
	public void logout()
	{
		logoutbtn.click();
	}
	
}
