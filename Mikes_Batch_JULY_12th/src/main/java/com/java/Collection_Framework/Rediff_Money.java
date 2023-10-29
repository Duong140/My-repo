package com.java.Collection_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Money {
	
	public static WebDriver driver;

	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.findElement(By.xpath("//*[@class = 'dataTable']/tbody/tr[16]/td[4]")).getText();
		
		
	}
}
