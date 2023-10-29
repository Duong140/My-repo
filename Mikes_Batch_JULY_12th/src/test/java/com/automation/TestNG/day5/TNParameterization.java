package com.automation.TestNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNParameterization {
	
	public WebDriver driver;
	
	
	@Test
	@Parameters({String })
	public void tnTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[text() = 'Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("doung140@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1235456");
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		
	}

}
