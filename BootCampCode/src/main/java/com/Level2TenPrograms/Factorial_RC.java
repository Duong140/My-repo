package com.Level2TenPrograms;

public class Factorial_RC {
	
public static void main(String[] args) {
		
		int num = 5;
		int output = 1;
		
		for(int i = 1 ; i<= num; i++) {
			
			output = output * i;
			
		} 
		
		System.out.println("output is: " + output);
		
		System.out.println(factorial_RC(6));

	}
	
	public static int factorial_RC(int num) {
		
		if(num == 1) {
			
			return 1;
			
		} else {
			
			return num * factorial_RC (num - 1);
		}
	}

}
