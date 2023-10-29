package com.automatio.TestNg.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority_Check {

	public WebDriver driver;
	
	
	@Test(priority=1)
	public void rediffTest() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redifff.com");
		driver.findElement(By.className("signing")).click();
		driver.findElement(By.id(null));
	}
	
	@Test

}
