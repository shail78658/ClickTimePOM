package com.clickTime.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.clickTime.qa.util.TestUtil;
import com.clickTime.qa.util.WebEventListener;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	
 
	public TestBase() throws IOException 
 {
	 
		prop= new Properties();
		 FileInputStream ip = new FileInputStream(("/Users/strivedi/workspace/FreeCRMTest/src/main/java/com/clickTime/qa/config/config.properties"));
		 prop.load(ip);

	 
 }
	public static void initialization() throws IOException
	{
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:/My Workspace/chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browserName.equals("FireFox"))
	{
		System.setProperty("webdriver.geckodriver.driver", "E:/My Workspace/chromedriver.exe");
		driver = new FirefoxDriver();	
	}
	e_driver = new EventFiringWebDriver(driver);
	// Now create object of EventListerHandler to register it with EventFiringWebDriver
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	} 
	
	
}
