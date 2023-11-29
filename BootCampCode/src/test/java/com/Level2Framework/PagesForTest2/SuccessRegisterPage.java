package com.Level2Framework.PagesForTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessRegisterPage {
	public WebDriver driver;
	
	
	@FindBy(xpath = "//*[@class = 'shopify-challenge__message']")
	private WebElement captchamessage;

	public SuccessRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public boolean captChaWarningbutsucessful() {
		
		boolean CM = captchamessage.isDisplayed();
		return CM;
		
	}
	
}
