package com.Framework.PagesForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchPage {
public WebDriver driver;
	
	@FindBy(linkText = "Samsung Galaxy Tab 10.1")
	private WebElement validProduct;
	
	@FindBy(xpath = "//div[@class = 'button-group']/button/span")
	private WebElement addtocartbutton;
	
	@FindBy(xpath = "//*[@id = 'cart-total']")
	private WebElement accountdropdown;
	
	@FindBy(xpath = "//*[text()= 'View Cart']")
	private WebElement viewcartbutton;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCorrectSearchItem() {
		boolean displayStatus = validProduct.isDisplayed();
		return displayStatus;
	}
	
	
	public void cartButton() {
		addtocartbutton.click();
	}
	
	public void dropDownForCart() {
		accountdropdown.click();
	}
	
	public void viewCartLink() {
		viewcartbutton.click();
	}
	
	public CartPage navigateToCartPage() {
		addtocartbutton.click();
		accountdropdown.click();
		viewcartbutton.click();
		return new CartPage(driver);
	}
}

