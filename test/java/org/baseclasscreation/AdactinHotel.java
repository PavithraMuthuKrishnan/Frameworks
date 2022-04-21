package org.baseclasscreation;

import org.openqa.selenium.WebElement;

public class AdactinHotel extends BaseClass {
public static void main(String[] args) {
	
	
	
	AdactinHotel a = new AdactinHotel();
	a.browserConfiguration();
	a.openUrl("https://adactinhotelapp.com/");
	a.maximizeWindow();
	
	WebElement txtUsername = a.locateById("username");
	a.insertText(txtUsername, "pavithra1997");
	WebElement txtPassword = a.locateById("password");
	a.insertText(txtPassword, "123456789");
	
	WebElement btnLogin = a.locateById("login");
	a.buttonClick(btnLogin);
	
	WebElement selectLocation = a.locateById("location");
	a.ddnByVisibleText(selectLocation, "Los Angeles");
	WebElement selectHotel = a.locateById("hotels");
	a.ddnByVisibleText(selectHotel, "Hotel Sunshine");
	WebElement selectroomtype = a.locateById("room_type");
	a.ddnByVisibleText(selectroomtype, "Super Deluxe");
	WebElement selectRooms = a.locateById("room_nos");
	a.ddnByVisibleText(selectRooms, "7 - Seven");
	
	WebElement search = a.locateById("Submit");
	a.buttonClick(search);
	
	WebElement btnclick = a.locateById("radiobutton_0");
	a.buttonClick(btnclick);
	
	WebElement btnctnue = a.locateById("continue");
	a.buttonClick(btnctnue);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
}
