package com.java.Collection_Framework;

import java.util.ArrayList;

public class Video2_Arrays_Vs_Collections {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4};
		
		
		Video2_Arrays_Vs_Collections obj1 = new Video2_Arrays_Vs_Collections();
		Video2_Arrays_Vs_Collections obj2 = new Video2_Arrays_Vs_Collections();
		Video2_Arrays_Vs_Collections obj3 = new Video2_Arrays_Vs_Collections();
		Video2_Arrays_Vs_Collections obj4 = new Video2_Arrays_Vs_Collections();
		
		Video2_Arrays_Vs_Collections[] ref = {obj1,obj1,obj3,obj4};
		
		ArrayList a1= new ArrayList();
		
		a1.add(obj1);
		a1.add(10);
		
	}

}
