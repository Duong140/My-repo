package com.Level2TenPrograms;

import java.util.StringTokenizer;

public class CountString {
	
	
	     
	 
	    public static int
	      countWords(String str)
	    {
	      
	        if (str    == null || str.isEmpty())
	            return 0;
	         
	     
	        StringTokenizer tokens = new
	          StringTokenizer(str);
	       
	        return tokens.countTokens();
	    }
	     
	
	    public static void main(String args[])
	    {
	          String str = 
	          "One two       three\n four\tfive ";
	         
	        System.out.println("No of words: " +
	          countWords(str));
	    }
	}

