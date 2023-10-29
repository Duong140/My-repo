package com.MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TotalNumberOfWebElements {
	
	public WebDriver driver;
	
	@Test
	public void bbcLinks() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println("Total links at this time: " + links.size());
		
		WebElement hundredthLink = links.get(99);
		hundredthLink.click();
		
		System.out.println(hundredthLink.getAttribute("href"));
		
		System.out.println(hundredthLink.getLocation().x + "----->" + hundredthLink.getLocation().y);
		
		for(int i=0; i<links.size() ; i++) {
			WebElement totalLinks = links.get(i);
			System.out.println(totalLinks.getText());
		}
	}

}
