package com.clickTime.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.clickTime.qa.base.TestBase;
import com.clickTime.qa.pages.HomePage;
import com.clickTime.qa.pages.LoginPage;
import com.clickTime.qa.util.TestUtil;

public class HomePageTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	String sheetName = "week";
	public HomePageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	
	public void setUp() throws IOException
	{
		initialization();
		loginpage = new LoginPage();
		homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitletest()
	{
		
		String homepage = homePage.verifyHomePageTitle();
		Assert.assertEquals(homepage, "ClickTime - Week View","home page title matched");
		
	}
	@Test(priority=2)
	public void verifyusernameLabeltest()
	{
		boolean flag = homePage.verifyusernameLabel();
		Assert.assertTrue(flag);
		
	}
	
//	@DataProvider
//	public Object[][] getWeeklyData() throws IOException
//	{
//		Object data[][] = TestUtil.getTestData(sheetName);
//		return data;
//	}
//	
	
	@Test(priority=3)
	public void fillTimeWeeklyTimeSheettest()
	{
		System.out.println("Hi");
		homePage.fillTimeWeeklyTimeSheet("One Network","ONET-0001-01-00 Logistics Network","503B - QA - Test Planning","9");
		System.out.println("Hi1");
	}

	@AfterMethod
	public void voidteardown()
	{
		driver.quit();
	}
}
