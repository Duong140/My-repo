package com.java.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class If_Else_practice {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=2Vt7Ik8Ublw");
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String expTitle = "Scrum in under 5 minutes - YouTube";
		String actTitle = driver.getTitle();
		
		
		String expCurrentUrl = "https://www.youtube.com/watch?v=2Vt7Ik8Ublw";
		String actCurrentUrl = driver.getCurrentUrl();
		
		
		if(expTitle.equals(actTitle) && expCurrentUrl.equals(actCurrentUrl) ) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"logo-icon\"]/yt-icon-shape/icon-shape/div")).click();
		} else {
			System.out.println("ooo shiett");
		}
	

	}

}
