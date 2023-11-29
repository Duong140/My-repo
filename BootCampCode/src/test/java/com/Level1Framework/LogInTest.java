package com.Level1Framework;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Level1Framework.PagesForTest.Accountpage;
import com.Level1Framework.PagesForTest.LandingPage;
import com.Level1Framework.PagesForTest.LogInPage;
import com.Level1Framework.TestBase.TestBase;



public class LogInTest extends TestBase {
	
	
	public WebDriver driver;
	public LandingPage landingpage;
	public LogInPage loginpage;
	public Accountpage accountpage;
	
	
	
	public LogInTest() throws Exception {
		super();
	}
	
	@BeforeMethod
		public void preLogIn() throws Exception {
		driver = OpenAppAndStartBrowser(prop.getProperty("browser"));
		landingpage = new LandingPage(driver);
		loginpage = landingpage.navigateToLoginPage();
		
		
		}
		
	
	@Test(priority=1) 
	public void LogInWithValidCredentials() {
		accountpage = loginpage.navigateToAccountPage();
		Assert.assertTrue(accountpage.verifyAccountLogIn());
		
	}
	
		
	@AfterMethod
	public void TearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
		
		
		
		
	
	
		

}
