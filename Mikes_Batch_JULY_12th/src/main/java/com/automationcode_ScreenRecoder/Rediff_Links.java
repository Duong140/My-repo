package com.automationcode_ScreenRecoder;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Links {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1500);
		
		List<WebElement> rediffFooterlinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		System.out.println("Total footer links are : " + rediffFooterlinks.size());
		
		for(int i=0 ; i<rediffFooterlinks.size() ; i++) {
			rediffFooterlinks.get(i).click();
			
			System.out.println("The title of this page is: " + driver.getTitle());
			
			driver.navigate().back();
			
			rediffFooterlinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		}
 
	}
	
	

}
