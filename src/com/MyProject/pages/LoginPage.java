package com.MyProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;

public class LoginPage 
{
  @FindBy(name="username")
  private WebElement usrnametxtbox;
  
  @FindBy(name="pwd")
  private WebElement pwdtxtbox;
  
  @FindBy(xpath="//input[@type='submit']")
  private WebElement submitbtn;
  
  @Test
  public LoginPage()
  {
	  PageFactory.initElements(BaseTestScript.driver, this);
  }
  @Test
  public void enterUserName(String un)
  {
	  usrnametxtbox.sendKeys(un); 
  }
  
  @Test
  public void enterPassWord(String pwd)
  {
	  pwdtxtbox.sendKeys(pwd);
  }
  
  @Test
  public void ClickOnSubmit()
  {
	  submitbtn.click();
  }
}
