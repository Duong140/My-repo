package com.automation.day6.Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Webelements {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement rediffLogo = driver.findElement(By.cssSelector("span.hmsprite.logo"));
		
		if(rediffLogo.isDisplayed()) {
			System.out.println("My url is correct");
		} else {
			System.out.println("My url is not correct");
		}
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		
		if(signinLink.isEnabled() && signinLink.isDisplayed()) {
			signinLink.click();
		} else {
			System.out.println("This link is not working");
		}
		
		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.name("proceed"));
		
		if(usernameTextBox.isEnabled() && passwordTextBox.isEnabled() && loginButton.isDisplayed()) {
			
		}
		
	}

}
