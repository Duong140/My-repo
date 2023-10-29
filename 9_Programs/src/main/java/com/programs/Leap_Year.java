package com.programs;

public class Leap_Year {

	public static void main(String[] args) {
		 
		int year = 2084;
		
		if(year % 400 ==0) {
			
			System.out.println("Leap Year!");
			
		} else if(year % 4 == 0 && year % 100 != 0) {
			
			System.out.println("Leap Year!");
			
		} else {
			
			System.out.println("Not a Leap Year");
			
		}

	}

}
