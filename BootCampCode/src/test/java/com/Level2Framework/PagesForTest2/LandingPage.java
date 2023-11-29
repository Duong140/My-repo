package com.Level2Framework.PagesForTest2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Level2Framework.Testbase2.TestBase;

public class LandingPage extends TestBase{
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@aria-label = 'Login']")
	private WebElement registerlinkbutton;
	
	@FindBy(xpath = "//div[@class = 'header__secondary-links']//a[2]")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id = 'predictive-search-form']//input")
	private WebElement searchforitemtext;
	
	@FindBy(xpath = "(//a[text() = 'Blog'])[2]")
	private WebElement verifyblogonhomepage;
	
	@FindBy(xpath = "//a[text() =  'Warranty']")
	private WebElement clickonwarrantylink;
	
	public LandingPage(WebDriver driver)throws Exception {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	


	public LoginPage registerLink() {
		registerlinkbutton.click();
		return new LoginPage(driver);
	}
	
	public void clickOnSearchButton() {
		searchbutton.click();
		
	}
	
	public void itemSearchTextBox() {
		searchforitemtext.sendKeys(prop.getProperty("item"));
	}
	
	public boolean verifyBlog() {
		boolean VB = verifyblogonhomepage.isDisplayed();
		return VB;
	}
	
	public WarrantyPage navigateToWarrantyPage() {
		clickonwarrantylink.click();
		return new WarrantyPage(driver);
	}
	
	
	public SearchPage NavigateToSearchPage() {
		searchbutton.click();
		searchforitemtext.sendKeys(prop.getProperty("item"));
		searchforitemtext.sendKeys(Keys.RETURN);
		return new SearchPage(driver);
	}
	
	

}
