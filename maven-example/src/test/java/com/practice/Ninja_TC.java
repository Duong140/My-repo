package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Ninja_TC {

	
		
		public static WebDriver driver;
		
		
		
		@Test(priority = 1, dataProvider = "websites", dataProviderClass = Ninja_DP.class )
		public static  void TC1(String website, String pass) throws Exception {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys(website);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name = 'password']")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
			Thread.sleep(1000);
			
			
			
		}
		
		@AfterMethod
		public static void Throws() {
			driver.quit();
		}
		
	
}
