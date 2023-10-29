package com.Boxing_Wrappers;

public class Parsing_Of_All_Types {

	public static void main(String[] args) {
		
		
		 stringToInt();
		 stringToDouble();
		 stringToChar();
		

	}
	
	public static void stringToInt() {
		
		String num1 =  "2023";
		int number = Integer.valueOf(num1);
		System.out.println(number);
		
		String num2 =  "2024";
		int number1 = Integer.parseInt(num2);
		System.out.println(number1);
		
		
	}
	
	public static void  stringToDouble() {
		
		String p1 = "29.99";
		String p2 = "19.99";
		
		double d1 = Double.parseDouble(p1);
		double d2 = Double.parseDouble(p2);
		
		double sum = d1+d2;
		System.out.println(sum);

		
		}
	
	public static void stringToChar() {
		
		String p1 = "Hello";
		char p2 = p1.charAt(4); // index 4 hell"o"
		System.out.println(p2);
		
	}

	
}
