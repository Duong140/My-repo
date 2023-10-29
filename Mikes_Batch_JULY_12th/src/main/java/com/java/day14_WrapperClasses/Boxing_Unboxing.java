package com.java.day14_WrapperClasses;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		
		boxingConcept();
		autoBoxingConcept();
		unboxingConcept();
		

	}
	
	public static void boxingConcept() {
		int a = 10;
		
		Integer b = Integer.valueOf(a);
		System.out.println("The converted int data type to Wrapper Class Object is : " + b);
	}
	
	public static void autoBoxingConcept() {
		int a = 10;
		Integer b = a;
		System.out.println(b);
	}
	
	public static void unboxingConcept() {
		Integer result = 200;
		int newResult = result.intValue();
		System.out.println(newResult);
		
	}
	public static void autoBoxingConcept() {
		
	}

}
