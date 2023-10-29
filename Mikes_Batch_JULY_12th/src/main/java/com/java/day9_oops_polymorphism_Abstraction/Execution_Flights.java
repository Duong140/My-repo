package com.java.day9_oops_polymorphism_Abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Execution_Flights implements DeccanAirways, SprintFlight {
	
	public static void main(String[] args) {
		//DeccanAirways dc = new DeccanAirways();
		
		
		DeccanAirways dc = new Execution_Flights(); //this class is known as implementing 

		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rediff.com");
		
		
	}

	@Override
	public void sprintFlightLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deccanFlightLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deccanPaymentOption() {
		// TODO Auto-generated method stub
		
	}
	
	

}
