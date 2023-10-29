package com.automation.day6.Validation_Techniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Intergrating_All_Validations {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// Webpage Validations
		//WebElement Validations
		//Warning Messages if any especially for my negative testing
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

	}
	
	public static void rediffPositive() {
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualtitle = driver.getTitle();
		String actualCurrenUrl = "https://www.rediff.com/";
		
		String expectedTitle = 
		
	}
	public static void rediffnegative() {
		
	}
	
	public static void tutorialNinjaPositive() {
		
	}
	
	public static void tutorialNinjaNegative() {
		
		
	}
	
	
	

}
