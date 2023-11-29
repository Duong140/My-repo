package com.Level2Framework2;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Level2Framework.PagesForTest2.LandingPage;
import com.Level2Framework.PagesForTest2.LoginPage;
import com.Level2Framework.PagesForTest2.RegisterPage;
import com.Level2Framework.PagesForTest2.SuccessRegisterPage;
import com.Level2Framework.Testbase2.TestBase;

public class RegisterTest extends TestBase {
	
	public LandingPage landingpage;
	public LoginPage loginpage;
	public RegisterPage registerpage;
	public SuccessRegisterPage successregisterpage;
	
	public RegisterTest() throws Exception  {
		super();
		
	}

	@BeforeMethod
	public void preRegister()throws Exception {
		driver = OpenAppAndStartBrowser(prop.getProperty("browser"));
		landingpage = new LandingPage(driver);
	}
	
	@Test
	public void registerSuccess() throws Exception {
		loginpage = landingpage.registerLink();
		registerpage = loginpage.navigateToRegisterAccount();
		successregisterpage = registerpage.successfulRegistration();
		Assert.assertTrue(successregisterpage.captChaWarningbutsucessful());
		
	}
	
	@AfterMethod
	public void teardown() throws Exception  {
		Thread.sleep(2000);
		driver.quit();
	}

}
