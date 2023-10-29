package com.autoation.TestNg.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TriCombo_ClassAssignment {
	
	//@Test - clickSignInLink
	//@Test - Login
	//@Test - Logout
	
	public WebDriver driver;
	
	@BeforeMethod	
	public void clickOnSignInLink() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

}
