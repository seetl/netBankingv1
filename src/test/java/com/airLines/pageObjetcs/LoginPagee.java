package com.airLines.pageObjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagee {
WebDriver ldriver;

	
	public LoginPagee (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement userName;

	@FindBy(name = "password")
	WebElement passWrd;

	@FindBy(name = "btnLogin")
	WebElement btnLogin;

	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		passWrd.sendKeys(pwd);
	}

	public void clicksubmit() {
		btnLogin.click();
	}

}

