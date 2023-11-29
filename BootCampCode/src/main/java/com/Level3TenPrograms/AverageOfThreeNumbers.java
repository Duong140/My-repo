package com.Level3TenPrograms;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = SC.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = SC.nextInt();
		
		System.out.println("Enter second number: ");
		int num3 = SC.nextInt();
		
		int average = (num1 + num2 + num3) / 3;
		
		System.out.println("Average of three numbers: " + average);

	}

}
