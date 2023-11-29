package com.Level2Framework.PagesForTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@class = 'product-item__image-wrapper product-item__image-wrapper--multiple']//a")
	private WebElement itemtoclickon;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnItem() {
		itemtoclickon.click();
	}
	
	public ProductPage navigateToProductPage() {
		itemtoclickon.click();
		return new ProductPage(driver);
	}

}
