package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmpom {

	public WebDriver drive;
	
	@FindBy(id="my_itinerary")
	private WebElement ibutton;

	public WebElement getIbutton() {
		return ibutton;
	}
	
	public Confirmpom(WebDriver d)
	{
		drive =d;
		PageFactory.initElements(drive, this);
	}
}
