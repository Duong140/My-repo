package com.Framework.PagesForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountpage {
	
	public WebDriver driver;
	
	@FindBy(linkText = "Edit your account information")
	private WebElement editYourAccountInfoLink;
	
	
	public Accountpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyAccountLogIn() {
		boolean accountEditLink = editYourAccountInfoLink.isDisplayed();
		return accountEditLink;
				
	}

}
