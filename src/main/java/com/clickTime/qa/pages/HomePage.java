package com.clickTime.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clickTime.qa.base.TestBase;

public class HomePage extends TestBase
{

	

	@FindBy(className="user-name")
	WebElement usernameLabel;
	
	@FindBy(xpath="//input[@id='combobox-1010-inputEl']")
	WebElement clientName;
	
	@FindBy(xpath="//input[@id='combobox-1012-inputEl']")
	WebElement projectName;
	
	@FindBy(xpath="//input[@id='combobox-1013-inputEl']")
	WebElement taskName;
	
	@FindBy(xpath="//input[@id='AT0_C2Hours-inputEl']")
	WebElement mondayTime;
	
	@FindBy(xpath="//span[@id='SaveButtonBottom-btnInnerEl']")
	WebElement saveButton;
	

	
	public HomePage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyusernameLabel()
	{
		 return usernameLabel.isDisplayed();
		
	}
	public String verifyHomePageTitle()
	{
		 return driver.getTitle();
		
	}
	public void fillTimeWeeklyTimeSheet(String c_Name, String p_name, String t_name, String hours) 
	{
		clientName.sendKeys(c_Name);
		projectName.sendKeys(t_name);
		projectName.sendKeys(t_name);
		mondayTime.sendKeys(hours);
		saveButton.click();	
	}
	
	
}
