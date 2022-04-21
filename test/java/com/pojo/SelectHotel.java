package com.pojo;

import org.baseclasscreation.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_1")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement btncontinue;
	

	public WebElement getSelect() {
		return select;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	
	
	

}
