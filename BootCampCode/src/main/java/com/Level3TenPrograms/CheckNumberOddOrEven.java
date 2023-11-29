package com.Level3TenPrograms;

import java.util.Scanner;



public class CheckNumberOddOrEven {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println( "Enter your number:");
		int num = SC.nextInt();
		if(num % 2 == 0) {
			System.out.println("Number is even: " + num);
		} else {
			System.out.println("Number is odd: " + num);
			
		}
		

	}

}
