package com.javacode.day3;

public class For_Loops {

	public static void main(String[] args) {
		//first step - initialization
		//second step - condition
		//third step  - if condition is true it will go inside the body of for loop
		//third step - if condition if false it will come outside of the for loop
		//fourth step - it will execute the logic inside the for loop body
		//5th step - it will update the value as per the inc/dec operator
		//6th step - check the condition is true it will again go inside the for loop body
		//7th step - if condition is true it will again go inside the for loop body
		//7th step - 0 if condition is false it will go out of the for loop
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		//WAP to print from 100 to 1 using for loop
		int sum= 0;
		
		for(int i=100; i>= 1; i--) {
			System.out.println(i + " ");
			sum = sum + i;
			
	
		}
		System.out.println(sum);	
		
		System.out.println();
		System.out.println("*********************************");
		
		//WAP to print from 500 till 0 with a difference of 25 and add the numbers
		//500, 475, 450,..........,25
		//500 + 475 + 450+.......+25 = ???
		
		int sum1= 0;
		
		for(int j=500; j>= 25; j-=25) {
			System.out.println(j + " ");
			sum1 = sum1 + j;
			
			}
		System.out.println(sum1);
	}

}
