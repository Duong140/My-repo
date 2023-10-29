package com.programs;

public class Swap_two_numbers {

	public static void main(String[] args) {
		
		int first = 200;
		int second = 100;
		System.out.println("Before swap");
		System.out.println("First value :" + first);
		System.out.println("Second value:" + second);
		
		int temp = first;
		first = second;
		second = temp;
		System.out.println("After swap");
		System.out.println("First value :" + first);
		System.out.println("Second value:" + second);
		
		No_3rd_var();

	}
	
	public static void No_3rd_var() {
		
		int i = 8;
		int x = 9;
		
		i = i + x; //i = 17
		x = i - x; //x = 8
		i = i - x; //i = 9
		
		System.out.println("i :" + i);
		System.out.println("x :" + x);
	}

}
