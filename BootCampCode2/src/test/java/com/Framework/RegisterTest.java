package com.Framework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.Framework.PagesForTest.LandingPage;
import com.Framework.PagesForTest.RegisterPage;
import com.Framework.Testbase.TestBase;

public class RegisterTest extends TestBase {
	
	public LandingPage landingpage;
	public RegisterPage registerpage;
	
	
	
	public RegisterTest() throws Exception {
		super();
		
	}
		
	@BeforeMethod
	public void preRegister() {
		driver = OpenAppAndStartBrowser(prop.getProperty("browser"));
		landingpage = new LandingPage(driver);
		
		
	}
	
	@Test
	public void registerTest() throws Exception {
		registerpage = landingpage.navigateToRegisterPage();
		registerpage.registerPageAllDetails();
		Assert.assertTrue(registerpage.duplicateEmailFailureMessage().contains(prop.getProperty("emailExistWarningMessage")));  
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
