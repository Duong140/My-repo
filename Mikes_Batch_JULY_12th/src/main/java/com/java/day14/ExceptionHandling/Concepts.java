package com.java.day14.ExceptionHandling;

import java.io.FileInputStream;

public class Concepts {
		
	
	
		// There are 2 types of Exception in java
		//1. CompileTime Exception [Checked Exception]
		//2. RunTimne Exception [unchecked Exception]
	public static void main(String[] args) {
		
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println(7/0); //this is a excpetion, can not divide by zero
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		

	}
	
	public static void validatingCompileTimeException() {
		FileInputStream ip = new FileInputStream("C:\Users\Mike La\workplace\Mikes_Batch_JULY_12th\src\test\java\com\automationcode\day2\ExcelDataCode.xlsx");
		
	}

}
