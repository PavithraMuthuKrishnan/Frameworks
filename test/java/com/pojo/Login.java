package com.pojo;

import org.baseclasscreation.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {

	public Login() {
		PageFactory.initElements(driver, this);
	}
	//@CacheLookup
	@FindBys({ @FindBy(id = "username"), @FindBy(xpath="//input[@id = 'username']") })
	private WebElement txtEmail;

	@CacheLookup
	@FindAll({ @FindBy(id = "password"), @FindBy(xpath = "//input[@id='name']") })
	private WebElement txtPass;

	@CacheLookup
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement btnLogin() {
		return btnLogin;
	}

}
