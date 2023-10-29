package com.automationcode.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://ebay.com");
		
		try {
		    Thread.sleep(5000);
		    driver.findElement(By.id("gh-minicart-hover")).click();
		    driver.findElement(By.id("checkbox")).click();
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		
		
		
		
		}

}
