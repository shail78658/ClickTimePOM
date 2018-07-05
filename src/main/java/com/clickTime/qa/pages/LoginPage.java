package com.clickTime.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clickTime.qa.base.TestBase;

public class LoginPage extends TestBase
{
	//Page factory:OR
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement lgn_button;
	
	
	@FindBy(id="logo")
	WebElement CliCkTime_logo;
	
// Intiatilizing page Objet
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCliCkTimeiMage()
	{
		return CliCkTime_logo.isDisplayed();
		
	}
	public HomePage login(String u_Name, String p_word) throws IOException
	{
		userName.sendKeys(u_Name);
		password.sendKeys(p_word);
		lgn_button.click();
		
		return new HomePage();
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
