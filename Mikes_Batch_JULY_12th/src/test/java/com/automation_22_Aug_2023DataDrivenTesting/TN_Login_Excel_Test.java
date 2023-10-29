package com.automation_22_Aug_2023DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TN_Login_Excel_Test {
	
	public WebDriver driver;
	@Test(priority = 1, dataProvider = "TNDATA", dataProviderClass = HowToReadFromExcel.class)
	public void loginTNTEST(String username, String password) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1500);
		driver.quit();
	}

}
