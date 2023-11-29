package com.Level2Framework2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Level2Framework.PagesForTest2.LandingPage;
import com.Level2Framework.PagesForTest2.WarrantyPage;
import com.Level2Framework.Testbase2.TestBase;

public class HomePageTest extends TestBase{
	
	public LandingPage landingpage;
	public WarrantyPage warrantypage;
	
	public HomePageTest() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void preHomePage() throws Exception {
		driver = OpenAppAndStartBrowser(prop.getProperty("browser"));
		landingpage = new LandingPage(driver);
	}
	
	@Test
	public void homePageTest() {
		Assert.assertTrue(landingpage.verifyBlog());
		warrantypage = landingpage.navigateToWarrantyPage();
		
	}
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
