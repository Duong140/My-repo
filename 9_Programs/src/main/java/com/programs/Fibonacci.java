package com.programs;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		int i;
		
		for( i = 0; i < 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}

}
