package com.automationcode.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Opening  {

	public static void main(String[] args)throws InterruptedException { //Added "throws InterruptedException"
		WebDriver driver = new ChromeDriver(); //ctrl shift o
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("C reate new account")).click();	
		Thread.sleep(5500); //Delays for 5.5 seconds because facebook is to slow for the code
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Xiomy");
	}

}
