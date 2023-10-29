package com.java.day14.ExceptionHandling;

public class Try_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validatingArithmeticException();
		tryCodeIsNotRiskySoWhatHappensToCatchBlock();

	}
	
	public static void validatingArithmeticException() {
		int a = 10, b = 0, c;
		try {
			c = a/b;
			System.out.println(c);
			System.out.println("I am insdie the try block wihtout risky code");
		} catch (Exception e) {
			System.out.println("Hellow World"); 
			e.printStackTrace();
		}
		
		
	}
	
	public static void tryCodeIsNotRiskySoWhatHappensToCatchBlock() {
		int a = 10, b = 2, c;
		try {
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Explanation:
	//Exception occurs at row number 14 for the method validatingArithmeticException
	//the method validatingArithmeticException will create an Object to handle this exception
	//since it is not able to handle the exception it is passing the Object to the compiler
	//Is compiler able to handle this Exception?
	//Answer: NO
	
	//Compiler will transfer this Exception Object to Default Exception Handler
	
	//What will DEH do??
	//it will print the Exception and it will print the following
	//ExceptionName - ArithmeticException
	//Description - / by Zero
	//stackTrace - it gives  the whole area where exceptions is occurring

}
