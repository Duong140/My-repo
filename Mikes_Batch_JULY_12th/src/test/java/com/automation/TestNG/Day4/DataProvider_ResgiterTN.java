package com.automation.TestNG.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_ResgiterTN {
	
	public WebDriver driver;
	
	
	@DataProvider
	public Object[][] getDate() {
		Object[][] data = { {"Duong", "La", "Doung140@gmail.com", "123456789", "Snake11911"},
							{"Duong", "La", "Doung140@gmail.com", "123456789", "Snake11911"} };
							
			return data;
							
		
		
		}
		@Test(dataProvider = "getData")
		public void registerTest(String firstname, String lastname, String email, String telephone, String password) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("input-firstname")).sendKeys(firstname);
			driver.findElement(By.id("input-lastname")).sendKeys(lastname);
			driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
			driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(password);
			driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
			driver.findElement(By.cssSelector("input[name+agree]")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			
			
		}
	
	

}
