package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	 
	

	public class Rework {
		
		
			public static WebDriver driver;

		public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();  //Crtl+Shift+O

			driver.manage().window().maximize();

			driver.get("http://www.rediff.com");

			driver.findElement(By.className("signin")).click();

			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");

			driver.findElement(By.name("passwd")).sendKeys("Selenium@123");

			driver.findElement(By.className("signinbtn")).click();

		}
}
