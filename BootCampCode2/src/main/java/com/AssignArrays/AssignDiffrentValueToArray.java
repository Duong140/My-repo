package com.AssignArrays;

public class AssignDiffrentValueToArray {

	public static void main(String[] args) {
		Object[] arr = new Object[4];
		
		arr[0] = Integer.valueOf(10);
		arr[1] = "Hey";
		arr[2] = Double.valueOf(20.99);
		arr[3] = Long.valueOf(1256488979);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
