package com.automationcode_ScreenRecoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TN_LI_LO {

	
		
		public static WebDriver driver;

		public static void main(String[] args) throws Exception {
				
					tn_LogIn();
			

		}
		
		public static void tn_LogIn() throws Exception {
			
		ScreenRecoderUtil.startRecord("tn_LogIn");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("Seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		ScreenRecoderUtil.stopRecord();
		
		
			
		}

		}


