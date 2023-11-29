package com.Level1Framework.PagesForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {
	public WebDriver driver;
	
	
	@FindBy(linkText = "My Account")
	private WebElement accountbutton;
	
	@FindBy(linkText = "Login")
	private WebElement loginlinkbutton;
	
	@FindBy(xpath = "//input[@name = 'search']")
	private WebElement searchBox;
	
	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccount() {
	accountbutton.click();
	}
	
	public void clickLoginLink() {
		loginlinkbutton.click();
	}
	
	public LogInPage navigateToLoginPage() throws Exception {
		accountbutton.click();
		loginlinkbutton.click();
		return new LogInPage(driver);
	}
	
	public void enterProductNameInSearchBox(String validProductText) {
		searchBox.sendKeys(validProductText);
	}
	
	public SearchPage clickOnSearchButton() {
		searchButton.click();
		return new SearchPage(driver);
	}
	
	public SearchPage navigateToSearchPage(String validProductText) {
		searchBox.sendKeys(validProductText);
		searchButton.click();
		return new SearchPage(driver);
	}
	
}
