package com.automation.TestNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RediffParameterization {
	
	//What are the things that we can parameterize??
	
	//browser
	//url
	//username
	//password
	
	public WebDriver driver;
	
	@Test
	@Parameters({"browser", "url", "username", "password"})
	public void reiffTest(String broswerName, String urlName, String userName, String passwordName) {
		
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgt");
		driver.findElement(By.id("login1")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passwordName);
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();		
	}

}
