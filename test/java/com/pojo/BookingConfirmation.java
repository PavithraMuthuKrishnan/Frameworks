package com.pojo;

import org.baseclasscreation.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}	
	
	
	
	
	
	
	
	
	
	
	

}
