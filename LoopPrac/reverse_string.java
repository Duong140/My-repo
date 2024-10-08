package LoopPrac;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class reverse_string {
	public WebDriver driver;
	
		
	@Test
	
	public void calc() {
	
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getHeader("content-type"));
		System.out.println(res.getTime());
		
		int statuscode = res.getStatusCode();
		
		Assert.assertEquals(statuscode,  200);
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
				
	}
	
}
}