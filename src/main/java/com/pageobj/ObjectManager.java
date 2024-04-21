package com.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Bookingpom;
import com.baseclass.Confirmpom;
import com.baseclass.Findpom;
import com.baseclass.Loginpom;
import com.baseclass.Selectpom;

public class ObjectManager {

	public WebDriver drive;
	
	private Loginpom log;
	
	private Findpom find;
	
	private Selectpom select;
	
	private Bookingpom book;
	
	private Confirmpom confirm;

	public Loginpom getLog() {
		log = new Loginpom(drive);
		return log;
	}

	public Findpom getFind() {
		find = new Findpom(drive);
		return find;
	}

	public Selectpom getSelect() {
		select =  new Selectpom(drive);
		return select;
	}

	public Bookingpom getBook() {
		book = new Bookingpom(drive);
		return book;
	}

	public Confirmpom getConfirm() {
		confirm = new Confirmpom(drive);
		return confirm;
	}
	
	public ObjectManager(WebDriver d)
	{
		drive = d;
		PageFactory.initElements(drive, this);
	}
	
}
