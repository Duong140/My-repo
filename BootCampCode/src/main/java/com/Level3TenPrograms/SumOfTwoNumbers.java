package com.Level3TenPrograms;

import java.util.Scanner;

public class SumOfTwoNumbers {
		
		
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		int num1 = SC.nextInt();
		
		System.out.println("Enter your second numbner: ");
		int num2 = SC.nextInt();
		
		int total = num1 + num2;
		System.out.println("Total sum: " + total);

	}
	

}
