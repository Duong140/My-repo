package com.ninja.validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations_register {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account"));
		driver.findElement(By.linkText("Register"));
		driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		//Privacy policy
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		
		//First Name
		
		String actualFirstNameWarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'First Name must be between 1 and 32 characters!')])")).getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";
		
		//Last Name
		
		String actualLastNameWarningMessage = driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]" )).getText();
		String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";
		
		//Telephone
		
		String actualTelephoneWarningMessage =driver.findElement(By.xpath());
		
		//Email
		
		//Password

	}

}
