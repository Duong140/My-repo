package com.automation.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Input_Parameters {
	
	public WebDriver driver;
	
	
	public static void main(String[] args) {
		Using_Input_Parameters ui = new Using_Input_Parameters();
		ui.loginTest(ui.driver, "https://google.com", "Chrome");
		

	}
	
	public void loginTest(WebDriver driver, String url, String browserName) {
		this.driver = driver;
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

}

