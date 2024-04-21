package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {

	public WebDriver drive;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement user;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public Loginpom(WebDriver d)
	{
		drive = d;
		PageFactory.initElements(drive, this);
	}
}
