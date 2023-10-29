package com.java.day14_WrapperClasses;

public class Parsing {
	
	public static void main(String[] args) {
		String price1 = "44.79";
		String price2 = "199.39";
		
		System.out.println(price1 + price2);
		StringtoInteger();
		StringToDouble();
		
	}
	
	public static void StringtoInteger() {
		
		String price1 = "450";
		String price2 = "150";
		
		System.out.println(price1 + price2);
		
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		int sum = p1 + p2;
		System.out.println(sum);
	}
	
	public static void StringToDouble() {
		String price1 = "450.52";
		String price2 = "128.48";
		
		double d1 = Double.parseDouble(price1);
		double d2 = Double.parseDouble(price2);
		
		double sum = d1+d2;
		System.out.println(sum);
	}
	
	

}
