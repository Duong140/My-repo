package com.automation.TakeScreenShots;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Demo {
	
	public WebDriver driver;
	
	@Test
	public void checkScreenShot() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2Ffolders%2F1%3Freason%3Dinvalid_crumb");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"a-d85645\"]/div[1]/table/tbody/tr[2]/td/a/img"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\ScreenShots\\logo2.png");
		
		FileHandler.copy(source, destination);
	}
	
	

}
//*[@id="red_container_main"]/div[3]/h5/a/img