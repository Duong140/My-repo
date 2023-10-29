package com.automation.TestNG.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_AssertTN {
	

	public WebDriver driver;
	
	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");

}
	
	@Test
	public void Warningpolicy() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actWarningMessage = driver.findElement(By.xpath("//div[@class = \"alert alert-danger alert-dismissible\"]")).getText();
		String expWarningMessage = "Warning: You must agree to the Privacy Policy!";
		
		Assert.assertEquals(actWarningMessage, expWarningMessage);
		System.out.println("somethings wrong");
		
		
	}
	
	@Test
	public void FirstName() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actWarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'First Name must be between 1 and 32 characters!')]")).getText();
		String expWarningMessage = "First Name must be between 1 and 32 characters!";
		
		Assert.assertEquals(actWarningMessage, expWarningMessage);
		System.out.println("somethings wrong");
		
		
		
	}
	
	@Test
	public void LastName() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actWarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'Last Name must be between 1 and 32 characters!')]")).getText();
		String expWarningMessage = "Last Name must be between 1 and 32 characters!";
		
		Assert.assertEquals(actWarningMessage, expWarningMessage);
		System.out.println("somethings wrong");
		
		
		
	}
	
	@Test
	public void emailWarning() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actWarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'E-Mail Address does not appear to be valid!')]")).getText();
		String expWarningMessage = "E-Mail Address does not appear to be valid!";
		
		Assert.assertEquals(actWarningMessage, expWarningMessage);
		System.out.println("somethings wrong");
	
	}
	
	@Test
	public void TelephoneWarning() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actWarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'Telephone must be between 3 and 32 characters!')]")).getText();
		String expWarningMessage = "Telephone must be between 3 and 32 characters!";
		
		Assert.assertEquals(actWarningMessage, expWarningMessage);
		System.out.println("somethings wrong");
	
	}
	
	@Test
	public void passwordWarning() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actWarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'Password must be between 4 and 20 characters!')]")).getText();
		String expWarningMessage = "Password must be between 4 and 20 characters!";
		
		Assert.assertEquals(actWarningMessage, expWarningMessage);
		System.out.println("somethings wrong");
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}
