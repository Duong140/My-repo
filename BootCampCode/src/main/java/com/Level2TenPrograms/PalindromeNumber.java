package com.Level2TenPrograms;

public class PalindromeNumber {
	
public static void main(String[] args) {
		
		int num = 45454;
		int rev = 0;
		int temp = num;
		
		while(num > 0) {
			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
			
			
		}
		if(rev == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
