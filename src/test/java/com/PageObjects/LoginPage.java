package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
///import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
///////////////////////////////////////
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtfname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtlname;
	
//	@FindBy(xpath="//button[contains(text(), 'Sign in']")
//	@CacheLookup
//	WebElement Signin;
//	
//	@FindBy(linkText="Contacts")
//	WebElement lnk;
//	
	
	///////////////////////////////
	
	public void setfname(String uname) {
		txtfname.sendKeys(uname);
	}
	
	public void setlname(String password) {
		txtlname.sendKeys(password);
	}
	
//	public void ClickSignIn() {
//		txtuname.click();
//	}
//	
	
	
	
}
