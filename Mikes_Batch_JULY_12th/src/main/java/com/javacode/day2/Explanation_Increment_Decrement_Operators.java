package com.javacode.day2;

public class Explanation_Increment_Decrement_Operators {

	public static void main(String[] args) {
		int i = 2;
		int j = ++i;
		//i = 3 now
		//j = 3 
		
		int k = i++ + ++i + j++;
		
		int l = k-- - --k + i-- - --i + j++ - --j;
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
