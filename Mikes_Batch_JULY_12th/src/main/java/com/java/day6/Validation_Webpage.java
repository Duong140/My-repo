package com.java.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Webpage {
	
	//GetTitle()
	//GetCurrentUrl()
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://www.rediff.com/";
		
		

	
	
	if(actualTitle.equals(expectedTitle)  && actualCurrentUrl.equals(expectedCurrentUrl)) {
		driver.findElement(By.className("signin")).click();
	} else {
		System.out.println("Either my url or my title are incorrect");
	}
	
	
  }
}
