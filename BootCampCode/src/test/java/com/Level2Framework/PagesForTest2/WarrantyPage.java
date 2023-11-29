package com.Level2Framework.PagesForTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WarrantyPage {
	
	public WebDriver driver;
	
	public WarrantyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
