package com.automation.TestNG.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Separate {
	
	
		public WebDriver driver;
		
		@Test(priority = 1, dataProvider = "getTNData", dataProviderClass = DataProviders_Separate.class)
		public void loginTNTest(String username, String password) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys(username);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
		}
		
		@Test(priority = 2, dataProvider = "getRediffData", dataProviderClass = DataProviders_Separate.class)
		public void loginRediffTest(String username, String password) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rediff.com");
				driver.findElement(By.className("signin")).click();
				driver.findElement(By.id("login1")).sendKeys(username);;
				driver.findElement(By.id("password")).sendKeys(password);;
				driver.findElement(By.name("proceed")).click();

}
	
}
