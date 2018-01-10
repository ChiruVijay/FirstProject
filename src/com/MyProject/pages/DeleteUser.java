package com.MyProject.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.MyProject.commonLib.BaseTestScript;

public class DeleteUser extends BasePage
{
	@FindBy(linkText="reddyreddy, rama (rama)")
	  private WebElement clickOnUser;
	  
	
  @FindBy(xpath="//input[@value='Delete this User']")
  private WebElement deleteUserbtn;
  
  
  @Test
  public DeleteUser()
  {
	  PageFactory.initElements(BaseTestScript.driver, this);
  }
  @Test
  public void clickonuser()
  {
	  clickOnUser.click(); 
  }
  
  @Test
  public void deleteUser()
  {
  deleteUserbtn.click();
  Alert a1 = BaseTestScript.driver.switchTo().alert();
  a1.accept();
  }
	
}
