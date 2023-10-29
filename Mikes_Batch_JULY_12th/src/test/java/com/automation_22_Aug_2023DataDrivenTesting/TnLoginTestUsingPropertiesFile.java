package com.automation_22_Aug_2023DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TnLoginTestUsingPropertiesFile {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	@Test
	public void loginTest() throws Exception{
		
		//step 1 - Create the Object of Properties Class
		prop = new Properties();
		
		//Step 2 - Create the Object of FileInputStream Class and pass the path of the .properties file
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation_22_Aug_2023DataDrivenTesting\\configTN.properties");
		
		//C:\\Users\\Mike La\\workplace\\Mikes_Batch_JULY_12th - System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
		
		prop.load(ip);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1500);
		driver.quit();		
	}
	

}
