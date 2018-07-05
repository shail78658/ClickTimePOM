package com.clickTime.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clickTime.qa.base.TestBase;
import com.clickTime.qa.pages.HomePage;
import com.clickTime.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{

	LoginPage loginpage;
	HomePage homePage;
	
	public LoginPageTest() throws IOException
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		loginpage = new LoginPage();
		
		
	}
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Time Tracking System | Sign in to ClickTime");
	}
	
	@Test(priority=2)
	public void clickTimeImageLogoTest()
	{
		boolean flag = loginpage.validateCliCkTimeiMage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() throws IOException
	{
		 homePage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void voidteardown()
	{
		driver.quit();
	}
	
	
	
	
	
}
