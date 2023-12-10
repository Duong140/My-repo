package com.Framework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Framework.PagesForTest.CartPage;
import com.Framework.PagesForTest.LandingPage;
import com.Framework.PagesForTest.SearchPage;
import com.Framework.Testbase.TestBase;




public class AddToCartTest extends TestBase {
	public WebDriver driver;
	public LandingPage landingpage;
	public SearchPage searchpage;
	public CartPage cartpage;
	
	public AddToCartTest() throws Exception {
		super();
	}
	
	
	
	@BeforeMethod
	public void preSearchProduct() {
		driver = OpenAppAndStartBrowser(prop.getProperty("browser"));
	}
	
	@Test(priority=1)
	public void productInCartVerifcation() {
		landingpage = new LandingPage(driver);
		searchpage = landingpage.navigateToSearchPage(prop.getProperty("validProduct"));
		cartpage = searchpage.navigateToCartPage();
		Assert.assertTrue(cartpage.verifyCorrectItemInCart());
		cartpage.checkoutButtonLink();
	}
	
	@AfterMethod
	public void TearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
