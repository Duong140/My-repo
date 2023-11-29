package com.Level1Framework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Level1Framework.PagesForTest.LandingPage;
import com.Level1Framework.PagesForTest.SearchPage;
import com.Level1Framework.TestBase.TestBase;

public class SearchTest extends TestBase{
	
	public WebDriver driver;
	public LandingPage landingpage;
	public SearchPage searchpage;

	public SearchTest() throws Exception {
		super();
		
	}
	
	@BeforeMethod
	public void preSearch() {
		driver = OpenAppAndStartBrowser(prop.getProperty("browser"));
	}
	
	@Test(priority = 1)
	public void searchAndVerify() {
		landingpage = new LandingPage(driver);
		searchpage = landingpage.navigateToSearchPage(prop.getProperty("ValidSearch"));
		Assert.assertTrue(searchpage.verifyCorrectSearchItem());
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
