package com.automation.TestNG.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Practice {
	
	public static WebDriver driver;
	
	@DataProvider
	public static Object[][] websites() {
		Object[][] Web = {  {"https://www.google.com/"},
						    {"https://www.w3schools.com/"},
						    {"https://www.cdkeys.com/"},
						    {"hello"},
						    {"1111"}
						 };
						
		return Web;
	} 
	
	@Test(dataProvider = "websites")
	public static void TC1(String website) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		
		
		
	}
	
	@AfterMethod
	public static void Throws() {
		driver.quit();
	}
	
	

}
