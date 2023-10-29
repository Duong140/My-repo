package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {
	
	public WebDriver driver;
	
	@Test
	public void fewMouseOperations() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Actions actions = new Actions(driver);
		WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));
		
		actions.moveToElement(getStartedFreeButton).click().perform();
		
		getStartedFreeButton.sendKeys(Keys.CONTROL);
	}

	

}
