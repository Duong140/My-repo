package com.automation.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_PopUps {
	
	public WebDriver driver;
	
	@Test
	public void rediffAlert() throws Exception{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		Alert alert = driver.switchTo().alert(); //Alert is a interface //getText(), accept(), and dismiss() 3 important methods for pop ups
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
	}
}
