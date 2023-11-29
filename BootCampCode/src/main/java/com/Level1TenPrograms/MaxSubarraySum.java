package com.Level1TenPrograms;

public class MaxSubarraySum {

	public static void main(String[] args) {
		int array[] = {1, 3, -4, 8, 6, 7, 2};
		int results = findMaxSum(array);
		System.err.println(results);
		

	}
	
	public static int findMaxSum(int[] array) {
		int maxSum = array[0];
		int sum = array[0];
		
		
		for(int i = 1; i < array.length; i++) {
			
			if(sum < 0) {
				sum = array[i];
				
			} else {
				sum = sum + array[i];
			}
			
			maxSum = Math.max(sum, maxSum);		
		}
		return maxSum;
	}

}
