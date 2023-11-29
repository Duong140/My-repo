package com.Level2Framework.PagesForTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id = 'AddToCart']")
	private WebElement addtocartbutton;
	
	@FindBy(xpath = "//*[@class = 'upcart-product-title-link styles_ProductRow__productTitleLink__YSz6V']")
	private WebElement verifyitemisaddedtocart;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartButton() {
		addtocartbutton.click();
	}
	
	public boolean verifyItemIsInCart() {
		 boolean VI = verifyitemisaddedtocart.isDisplayed();
		 return VI;
	}
	

}
