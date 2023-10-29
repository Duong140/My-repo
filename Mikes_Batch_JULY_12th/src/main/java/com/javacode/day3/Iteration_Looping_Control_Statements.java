package com.javacode.day3;

public class Iteration_Looping_Control_Statements {

	public static void main(String[] args) {
		// While Loop
		// While loop is a control flow statement which is used when the boolean condition needs a lot of repetition
		// while loop is also known as repeating if statement
		// if the number of iterations is not fixed, it is recommended to use while loop
		
		
		
		//initialization 
		//condition
		//increment or decrement or upgradation or degradation
		
		int i=1;
		
		while(i<=10) {
			System.out.println(i);
			break;
		}
		
		//WAP to print first 10 natural numbers using while loop
		
		int j=1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("*************************************");
		
		//WAP to print first 20 whole numbers
		
		int k=1;
		while(k<=20) {
			System.out.println(k);
			k++;
			
		}
		System.out.println();
		
		System.out.println("*************************************");
		
		//WAP to print first 25 even numbers
		
		
		
		
		
		
		//WAP to print 20 numbers in reverse order starting from 100 and decrement of 5
		
		int q = 100;
		while(q>=5) {
			System.out.println(q + " ");
			q = q-5;
		}

	}

}
