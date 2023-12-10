package com.Level1Framework.PagesForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public WebDriver driver;
	
	@FindBy(linkText = "iPhone")
	private WebElement validProduct;
	
	
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCorrectItemInCart() {
		boolean displayStatus = validProduct.isDisplayed();
		return displayStatus;
	}
	
	

}
