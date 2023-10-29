package com.Boxing_Wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Options {
	
	public static WebDriver driver;	

	public static void main(String[] args) throws Exception {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("123345@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123345");
		Thread.sleep(1500);
		driver.quit();

	}

}
