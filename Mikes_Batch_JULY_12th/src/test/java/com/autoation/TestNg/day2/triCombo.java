package com.autoation.TestNg.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class triCombo {
	
	public WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup() throws Exception{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		Thread.sleep(1500);
		driver.findElement(By.linkText("My Account")).click();
		
		
	}
	
	@Test(priority=1)
	public void loginTest() throws Exception{
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("Seleniumpanda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1000);
	
	}
	
	@Test(priority=2)
	public void logoutTest() throws Exception {
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}
	

}
