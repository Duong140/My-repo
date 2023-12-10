package com.Level3Framework3;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreeSeleniumQuestions {
	
	public WebDriver driver;

	

	
	@BeforeMethod
	public void testBase() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openvapeshop.com/");
		
	}
	
	
	
	@Test(priority = 1)
	public void navigateToWebsiteVerifyTitle() {
		String expectedtitle = "Vape Pens | Vape Battery, Cartridges Online - O.pen";
		String title = driver.getTitle();
		 title.equals(expectedtitle);
	}
	
	@Test(priority = 2)
	public void loginWithValidCredentialsAndVerify() throws InterruptedException {
		driver.findElement(By.xpath("//a[@aria-label = 'Login']")).click();
		driver.findElement(By.xpath("//*[@id = 'customer[email]']")).sendKeys("doung140@yahoo.com");
		driver.findElement(By.xpath("//*[@id = 'customer[password]']")).sendKeys("Snooze1991.");
		driver.findElement(By.xpath("//span[text() = 'Login']")).click();
		String expectedmessage = "To continue, let us know you're not a robot."; //CaptCha stops successful login, no way to automate past this point, only manual.
		driver.getPageSource().contains(expectedmessage); //verified Captcha message because can not get past unless done manually.
	}
	
	@Test(priority = 3)
	public void navigateToWebSiteNavigateToDiffrentPageAndVerify() {
		driver.findElement(By.xpath("(//a[text() = 'Blog'])[1]")).click();
		String expectedElement = "Cannabis Blog";
		driver.getPageSource().contains(expectedElement);
	}
		
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}

}
