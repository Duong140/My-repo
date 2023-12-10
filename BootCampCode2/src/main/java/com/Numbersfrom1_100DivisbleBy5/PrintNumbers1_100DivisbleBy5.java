package com.Numbersfrom1_100DivisbleBy5;

import java.util.ArrayList;
import java.util.List;

public class PrintNumbers1_100DivisbleBy5 {

	
		 public static List<String> divisbleBy(int n)
		    {
		        // Declare a list of strings to store the results
		        List<String> result = new ArrayList<>();
		 
		        // Loop from 1 to n (inclusive)
		        for (int i = 1; i <= n; ++i) {
		           
		            // Check if i is divisible by both 3 and 5
		            if (i % 3 == 0 && i % 5 == 0) {
		               
		                // Add "FizzBuzz" to the result list
		                result.add(" ");
		            }
		           
		            // Check if i is divisible by 3
		            else if (i % 3 == 0) {
		               
		                // Add "Fizz" to the result list
		                result.add(" ");
		            }
		           
		            // Check if i is divisible by 5
		            else if (i % 5 == 0) {
		               
		                // Add "Buzz" to the result list
		                result.add(" ");
		            }
		            else {
		               
		                // Add the current number as a string to the
		                // result list
		                result.add(Integer.toString(i));
		            }
		        }
		 
		        // Return the result list
		        return result;
		    }
		 
		    public static void main(String[] args)
		    {
		        int n = 20;
		 
		        // Call the fizzBuzz function to get the result
		        List<String> result = divisbleBy(n);
		 
		        // Print the result
		        for (String s : result) {
		            System.out.print(s + " ");
		        }
		    }

	}


