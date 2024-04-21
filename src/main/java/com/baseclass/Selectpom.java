package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectpom {

	public WebDriver drive;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement select;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getCont() {
		return cont;
	}

	public Selectpom(WebDriver d)
	{
		drive =d;
		PageFactory.initElements(drive, this);
	}
}
