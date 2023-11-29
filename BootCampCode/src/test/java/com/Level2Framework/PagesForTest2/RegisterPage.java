package com.Level2Framework.PagesForTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Level2Framework.Testbase2.TestBase;

public class RegisterPage extends TestBase{
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id = 'customer[first_name]']")
	private WebElement firstnametextbox;
	
	@FindBy(xpath = "//*[@id = 'customer[last_name]']")
	private WebElement lastnametextbox;
	
	@FindBy(xpath = "//*[@id = 'customer[email]']")
	private WebElement emailtextbox;
	
	@FindBy(xpath = "//*[@id = 'customer[password]']")
	private WebElement passwordtextbox;
	
	@FindBy(xpath = "//*[text()= 'Create account']")
	private WebElement createaccountbutton;


	public RegisterPage(WebDriver driver)throws Exception {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	
	
		public void textForFirstName() {
			firstnametextbox.sendKeys(prop.getProperty("firstname"));
		
	}
		
		public void lastNameText() {
			lastnametextbox.sendKeys(prop.getProperty("lastname"));
		
	}
		
		public void emailName() {
			emailtextbox.sendKeys(prop.getProperty("email"));
		
	}
		
		public void passwordText() {
			passwordtextbox.sendKeys(prop.getProperty("password"));
			
	}
		public void createbutton() {
			createaccountbutton.click();
		}
		
		public SuccessRegisterPage successfulRegistration() {
			firstnametextbox.sendKeys(prop.getProperty("firstname"));
			lastnametextbox.sendKeys(prop.getProperty("lastname"));
			emailtextbox.sendKeys(prop.getProperty("email"));
			passwordtextbox.sendKeys(prop.getProperty("password"));
			createaccountbutton.click();
			return new SuccessRegisterPage(driver);
		}
		

}
	


