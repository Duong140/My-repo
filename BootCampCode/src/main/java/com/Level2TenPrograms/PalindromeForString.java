package com.Level2TenPrograms;

public class PalindromeForString {
	public static void main(String[] args) {

	    String PS = "Noon", reverseStr = "";
	    
	    int strLength = PS.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	  
	      reverseStr = reverseStr + PS.charAt(i);
	    }

	    if (PS.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(PS + " is a Palindrome String.");
	      
	    }
	    else {
	    	
	      System.out.println(PS + " is not a Palindrome String.");
	    }
	  }

}
