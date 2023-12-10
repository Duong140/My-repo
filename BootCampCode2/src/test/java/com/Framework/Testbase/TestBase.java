package com.Framework.Testbase;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public ChromeOptions options;
	public Properties prop;
	public FileInputStream ip;
	
	public TestBase() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\Data\\data.properties");
		prop.load(ip);
	}
	
	public WebDriver OpenAppAndStartBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
		} else if (browserName.equals("firefox")){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if(browserName.equals("edge"))
			driver = new EdgeDriver();
		driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
	driver.get(prop.getProperty("url"));
	return driver;
	}
}
 