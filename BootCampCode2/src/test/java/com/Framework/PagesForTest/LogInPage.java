package com.Framework.PagesForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Framework.Testbase.TestBase;









public class LogInPage extends TestBase {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id ='input-email']")
	private WebElement emailtextbox;
	
	@FindBy(xpath = "//*[@id = 'input-password']")
	private WebElement passwordtextbox;
	
	@FindBy(xpath = "//input[@class = 'btn btn-primary']")
	private WebElement loginbutton;
	
	
	
	
	
	public LogInPage(WebDriver driver)throws Exception {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	
	public Accountpage navigateToAccountPage() {
		emailtextbox.sendKeys(prop.getProperty("validEmail"));
		passwordtextbox.sendKeys(prop.getProperty("validPassword"));
		loginbutton.click();
		return new Accountpage(driver);
		
	}
	
}
