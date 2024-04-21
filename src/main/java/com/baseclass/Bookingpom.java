package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingpom {
	
	public WebDriver drive;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement billing_addrs;
	
	@FindBy(id="cc_num")
	private WebElement cno;
	
	@FindBy(name="cc_type")
	private WebElement ctype;
	
	@FindBy(name="cc_exp_month")
	private WebElement cexpmonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement cexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="book_now")
	private WebElement book;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBilling_addrs() {
		return billing_addrs;
	}

	public WebElement getCno() {
		return cno;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getCexpmonth() {
		return cexpmonth;
	}

	public WebElement getCexpyear() {
		return cexpyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	public Bookingpom(WebDriver d)
	{
		drive =d;
		PageFactory.initElements(drive, this);
	}

}
