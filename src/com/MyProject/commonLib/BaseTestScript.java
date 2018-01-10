package com.MyProject.commonLib;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class BaseTestScript
{
  
	public static WebDriver driver;
	
	@BeforeMethod
	public void preSteps() throws Exception
	{
		String path = "./testdata/conf.xlsx";
		String browsertype = ExcelLib.getCellData(path,"condata", 1, 0);
		String buildurl = ExcelLib.getCellData(path, "condata", 1, 1);
		
		if(browsertype.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver","./exe files/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsertype.equals("gc"))
		{
			System.setProperty("webdriver.chrome.driver","./exe files/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(buildurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	/*@AfterMethod
	public void postSteps()
	{
		driver.close();
	}*/
	
	@AfterSuite
	public void backup()
	{
		try
		{
		Date d1 = new Date();
		String date = d1.toString().replace(':','_');
		File src = new File("./test-output");
		File tar = new File("./resports/"+date+".zip");
		Zip z1 = new Zip();
		z1.zip(src, tar);
		}
		catch(Exception e)
		{
			
		}
	}
}
