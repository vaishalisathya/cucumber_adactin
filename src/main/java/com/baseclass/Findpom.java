package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Findpom {

	
	public WebDriver drive;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement no_of_room;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkout;
	
	@FindBy(name="adult_room")
	private WebElement adult;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;


	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNo_of_room() {
		return no_of_room;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public Findpom(WebDriver d)
	{
		drive = d;
		PageFactory.initElements(drive, this);
	}
	
}
