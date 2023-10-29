package com.automationcode.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// id
		// class
		// name 
		// linktext
		// partiallinktext
		// xpath
		// cssSelector
		// tagname
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text() = 'My Account']")).click();
		//driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Mike");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("La");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("doung140@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("2036761683");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("hello123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("hello123");
		driver.findElement(By.xpath("//input{@name = 'newsletter and @value = '1")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		FacebookCreate();
	}
	
		
		public static void FacebookCreate() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com");
			driver.findElement(By.linkText("Create new account")).click();	
			Thread.sleep(5500);
			driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("NINJATURTLE");
			driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("LEO");
			driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("LEO@gmail.com");
			driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("LEO@gmail.com");
			driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("password1234");
			Select se = new Select(driver.findElement(By.xpath("//select[@id = 'month']")));
			se.selectByIndex(3);
		}

		
		/*public static void mycarhelpline() {
			WebDriver driver = new ChromeDriver();
			driver.get("https//mycarhelpline.com");
			driver.findElement(By.xpath("//input[@name = 'loan']"));*/
			
		}
	


