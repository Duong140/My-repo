package com.javacode.day3;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1 ; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	for(int i=1; i<=5; i++) {
			
			for(int j=1 ; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	for(int i=1 ; i<=5 ; i++) {
		for (int j=1 ; j<=i ; j++) {
		System.out.print("* ");
		}
		System.out.println();
		}

		for(int i=1 ; i<=5 ; i++) {
		for (int j=4 ; j>=i ; j--) {
		System.out.print("* ");
		}
		System.out.println();
		}
		
		for(int o=1 ; o<=5 ; o++) {
			for(int k=4 ; k>=o ; k--) {
			System.out.print("* ");	
			}
			System.out.println();
		}
	
	}
}
