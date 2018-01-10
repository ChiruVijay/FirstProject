package com.MyProject.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import com.MyProject.commonLib.BaseTestScript;

public class EditUserPage extends BasePage
{
	//@FindBy(xpath="//a[contains(text(),'rama, rama (rama)')]")
	@FindBy(linkText="rama, rama (rama)")
	private WebElement clickOnCreatedUser;
	
	@FindBy(name="lastName")
	private WebElement reEnterLastname;
	
	@FindBy(name="workdayDuration")
	private WebElement workdurationdrpdwn;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickSavechanges;
	
	@Test
	public void clickOnCretedUser()
	{
		clickOnCreatedUser.click();
	}
	@Test
	public void reEnetrLastname(String rln)
	{
		reEnterLastname.clear();
		reEnterLastname.sendKeys(rln);
	}
	
	@Test
	public void workDuration()
	{
		Select s1 = new Select(workdurationdrpdwn);
		s1.selectByVisibleText("9:00");
		
	}
	
	@Test
	public void clickSaveChange()
	{
		clickSavechanges.click();
	}
	
  
}
