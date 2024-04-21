package com.adactin.stefdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Runner;
import com.baseclass.Base;
import com.pageobj.ObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stefdefinition extends Base{

	public static WebDriver drive=Runner.drive;
	
	ObjectManager ob = new ObjectManager(drive);
	
	@Given("user launch the url of the adactin")
	public void user_launch_the_url_of_the_adactin() {
	   getUrl("https://adactinhotelapp.com/");
	   maximize();
	}
	@When("enter the user name")
	public void enter_the_user_name() {
		input(ob.getLog().getUser(),"nivi2430");
		
	}
	@When("enter the password")
	public void enter_the_password() {
		input(ob.getLog().getPass(),"vaishu24041998");
	}
	@Then("login by clicking the button")
	public void login_by_clicking_the_button() {
		btnClick(ob.getLog().getLogin());
	}
	
	@When("user can select the location")
	public void user_can_select_the_location() {
		dropdown(ob.getFind().getLocation(),"London","value");
	}

	@When("user can select hotel")
	public void user_can_select_hotel() {
		dropdown(ob.getFind().getHotel(),"4","index");
	}

	@When("user can select room type")
	public void user_can_select_room_type() {
		dropdown(ob.getFind().getRoom_type(),"Deluxe","visible text");
	}

	@When("user can select number of rooms")
	public void user_can_select_number_of_rooms() {
		dropdown(ob.getFind().getNo_of_room(),"3","value");
	}

	@When("user can enter check in date")
	public void user_can_enter_check_in_date() {
		input(ob.getFind().getCheckin(),"05/04/2024");
	 	}

	@When("user can enter check out date")
	public void user_can_enter_check_out_date() {
		input(ob.getFind().getCheckout(),"07/04/2024");
		
	}

	@When("select adults per room")
	public void select_adults_per_room() {
		dropdown(ob.getFind().getAdult(),"3 - Three","visible text");
	}

	@When("select children per room")
	public void select_children_per_room() {
		dropdown(ob.getFind().getChild(),"2 - Two","visible text");
	}

	@Then("click the search button to search the hotel rooms")
	public void click_the_search_button_to_search_the_hotel_rooms() {
		btnClick(ob.getFind().getSearch());
	}

	@When("user can select the radio button to select the hotel")
	public void user_can_select_the_radio_button_to_select_the_hotel() {
		btnClick(ob.getSelect().getSelect());
	}

	@Then("click the continue button")
	public void click_the_continue_button() {
		btnClick(ob.getSelect().getCont());
	}

	@When("enter the first name")
	public void enter_the_first_name() {
		input(ob.getBook().getFname(),"Vaishali");
	}

	@When("enter the last name")
	public void enter_the_last_name() {
		input(ob.getBook().getLname(),"Sathyanarayanan");
	}

	@When("enter the billing address")
	public void enter_the_billing_address() {
		input(ob.getBook().getBilling_addrs(),"No 5,pillayar koil st,tondaiyarpet");
	}

	@When("enter the credit card number")
	public void enter_the_credit_card_number() {
		input(ob.getBook().getCno(),"3459789654673478");
	}

	@When("select credit card type")
	public void select_credit_card_type() {
		dropdown(ob.getBook().getCtype(),"Master Card","visible text");
	}

	@When("select credit card exp month")
	public void select_credit_card_exp_month() {
		dropdown(ob.getBook().getCexpmonth(),"March","visible text");
	}

	@When("select Credit card exp year")
	public void select_credit_card_exp_year() {
		dropdown(ob.getBook().getCexpyear(),"2029","visible text");
	}

	@When("enter cvv number")
	public void enter_cvv_number() {
		input(ob.getBook().getCvv(),"566");
	}

	@Then("click the book now option")
	public void click_the_book_now_option() {
		implicitWait();
		btnClick(ob.getBook().getBook());
	}

	@Then("click the itinerary button")
	public void click_the_itinerary_button() {
		implicitWait();
		btnClick(ob.getConfirm().getIbutton());
	}

	@Then("take screenshot of the webpage")
	public void take_screenshot_of_the_webpage() throws IOException {
		screenshot("finalscreenshot");
	}
}
