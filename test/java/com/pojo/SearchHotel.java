package com.pojo;

import org.baseclasscreation.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id="location")
private WebElement location;	
	@FindBy(id="hotels")
private WebElement hotels;
	@FindBy(id="room_type")
private WebElement roomtypes;
	@FindBy(id="room_nos")
private WebElement numberofrooms;
	@FindBy(id="datepick_in")
private WebElement checkindate;
	@FindBy(id="datepick_out")
private WebElement checkoutdate;
	@FindBy(id="adult_room")
private WebElement adultsperroom;
	@FindBy(id="child_room")
private WebElement childrenperroom;
	@FindBy(id="Submit")
	private WebElement Search1;
	




	
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtypes() {
	return roomtypes;
}
public WebElement getNumberofrooms() {
	return numberofrooms;
}
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckoutdate() {
	return checkoutdate;
}
public WebElement getAdultsperroom() {
	return adultsperroom;
}
public WebElement getChildrenperroom() {
	return childrenperroom;
}
public WebElement getSearch1() {
	return Search1;
}



}
