package com.sgtesting.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//User Name Text field in Login Page
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field in Login Page
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login Button in Login Page
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLoginBtn;
	public WebElement getLoginBtn()
	{
		return oLoginBtn;
	}
	
	//FlyoutWindow in Home Page
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link in Home Page
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}
