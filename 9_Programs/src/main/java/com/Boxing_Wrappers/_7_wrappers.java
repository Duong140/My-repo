package com.Boxing_Wrappers;

public class _7_wrappers {

	public static void main(String[] args) {
	
		
		autoUnboxing();
		unboxing_1();
		boxing_1();
		autoBoxing();
		
	}
	
	public static void boxing_1() {
		 int i = 20;
		 Integer a = Integer.valueOf(i);
		 System.out.println("The int data is converted to Wrapper class: " + a);
		 
		 
		 int j = 35;
		 Integer x = Integer.valueOf(j);
		 System.out.println(x);
		 
		
		
	}
	
	public static void autoBoxing() {
		
		int i = 20;
		Integer a = i;
		System.out.println("The int data is converted to wrapper class automatically: " + a);
		
		int j = 345;
		Integer x = j;
		System.out.println(x);
		
	}
	
	public static void unboxing_1() {
		Integer result = 200;
		int newResult = result.intValue();
		System.out.println("The Wrapper Class is getting coinverted to primitive data using unboxing: " + newResult);
		
		Integer num = 456654;
		int num1 = num.intValue();
		System.out.println(num1);
		
	}
	
	
	public static void autoUnboxing(){
		
		Integer result = 300;
		int newResult = result;
		System.out.println("The Wrapper Class is getting coinverted to primitive datta using unboxing: " + newResult);
		
		Integer num = 564;
		int num1 = num;
		System.out.println(num1);
		
	}

}
