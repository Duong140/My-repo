package com.Level2Framework2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Level2Framework.PagesForTest2.LandingPage;
import com.Level2Framework.PagesForTest2.ProductPage;
import com.Level2Framework.PagesForTest2.SearchPage;
import com.Level2Framework.Testbase2.TestBase;

public class AddToCartTest extends TestBase {
	
	public LandingPage landingpage;
	public SearchPage searchpage;
	public ProductPage productpage;

	public AddToCartTest() throws Exception {
		super();
	
	}
	
	@BeforeMethod
	public void preAddCart() throws Exception {
		driver = OpenAppAndStartBrowser(prop.getProperty("browser"));
		landingpage = new LandingPage(driver);
	}
	
	@Test
	public void addToCartTest() {
		searchpage = landingpage.NavigateToSearchPage();
		productpage = searchpage.navigateToProductPage();
		productpage.addToCartButton();
		Assert.assertTrue(productpage.verifyItemIsInCart());
		}
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
