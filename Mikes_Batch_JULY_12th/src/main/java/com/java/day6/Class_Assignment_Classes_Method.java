package com.java.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Assignment_Classes_Method {
	
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws Exception{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cdkeys.com/");
		driver.findElement(By.xpath("//*[@id = 'search']")).sendKeys("Call of Duty");
		Thread.sleep(1200);
		driver.findElement(By.xpath("//*[@id=\"instant-search-results-container\"]/div/div/ol/li[3]/div/div/div/div[2]/h3/a")).click();
		driver.findElement(By.xpath("//button[@id = 'product-addtocart-button']")).click();
		
	}

}
