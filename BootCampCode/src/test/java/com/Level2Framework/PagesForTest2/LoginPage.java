package com.Level2Framework.PagesForTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	
	@FindBy(xpath = "//*[text() = 'Create an account']" )
	private WebElement createaccountlink;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage navigateToRegisterAccount() throws Exception {
		createaccountlink.click();
		return new RegisterPage(driver);
	}

	
	
}


