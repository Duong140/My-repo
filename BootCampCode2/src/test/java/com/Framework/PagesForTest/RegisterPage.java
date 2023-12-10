package com.Framework.PagesForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Framework.Testbase.TestBase;


public class RegisterPage extends TestBase{
	
public WebDriver driver;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneTextBox;
	
	@FindBy(id = "input-password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(css = "label.radio-inline:nth-child(1) > input")
	private WebElement newsletterRadiobutton;
	
	@FindBy(xpath = "//input[@name = 'agree' and @value = '1']")
	private WebElement privacyPolicyCheckbox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-dismissible')]")
	private WebElement EmailFailureMessage;
	
	public RegisterPage(WebDriver driver) throws Exception {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterFirstName() {
		firstNameTextBox.sendKeys(prop.getProperty("firstnametext"));
	}
	
	public void enterLastName() {
		lastNameTextBox.sendKeys(prop.getProperty("lastnametext"));
	}
	
	public void enterEmail() {
		emailTextBox.sendKeys(prop.getProperty("emailtext"));
	}
	
	public void enterTelephone() {
		telephoneTextBox.sendKeys(prop.getProperty("telephonetext"));
	}
	
	public void enterPassword() {
		passwordTextBox.sendKeys(prop.getProperty("passwordtext"));
	}
	
	public void enterConfirmPassword() {
		confirmPasswordTextBox.sendKeys(prop.getProperty("confirmpassword"));
	}
	
	public void clickNewsletterRadioButton() {
		newsletterRadiobutton.click();
	}
	
	public void checkPrivacyPolicy() {
		privacyPolicyCheckbox.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public String duplicateEmailFailureMessage() {
		String duplicateEmail = EmailFailureMessage.getText();
		  return duplicateEmail;
	}
	
	
	public void registerPageAllDetails() {
		firstNameTextBox.sendKeys(prop.getProperty("firstnametext"));
		lastNameTextBox.sendKeys(prop.getProperty("lastnametext"));
		emailTextBox.sendKeys(prop.getProperty("emailtext"));
		telephoneTextBox.sendKeys(prop.getProperty("telephonetext"));
		passwordTextBox.sendKeys(prop.getProperty("passwordtext"));
		confirmPasswordTextBox.sendKeys(prop.getProperty("confirmpassword"));
		newsletterRadiobutton.click();
		privacyPolicyCheckbox.click();
		continueButton.click();
		
			
	}


}
