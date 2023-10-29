package com.programs;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 5;
		int output = 1;
		
		for(int i = 1 ; i<= num; i++) {
			
			output = output * i;
			
		} 
		
		System.out.println("output is: " + output);
		
		System.out.println(Factorial_RC(6));

	}
	
	public static int Factorial_RC(int num) {
		
		if(num == 1) {
			
			return 1;
			
		} else {
			
			return num * Factorial_RC (num - 1);
		}
	}
	

}
