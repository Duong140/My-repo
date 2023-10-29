package com.automation.TestNG.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations_TestNG {

	//annotations 
	//for any annotations to work you have to create a method below it
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Executing first");
	}
	
	@BeforeTest
	public void besforetest() {
		System.out.println("Excuting Second");
		
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Excuting third");
	}

	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Executing fourth");
	}
	
	//@Test //this is the execution engine

}
