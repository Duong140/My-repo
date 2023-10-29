package com.automation.TestNG.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions_TestNG {
	
	//There are 2 types oif Assertions in TestNG
	
	//1. Assert
	//2.SoftAssert
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test(priority = 1)
	public void loginLogic() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement editAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		Assert.assertTrue(editAccountInfoLink.isDisplayed(), "I have done something wrong and the link is not getting displayed");
		System.out.println(1 + 2);
		
}
	
	@Test(priority = 2)
	public void logoutLogic() {
		
	}
	
	@AfterMethod
	public void quittest() {
		driver.quit();
	}
}
