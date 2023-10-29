package com.java.day9_oops_polymorphism_method_overloading;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(10);
		main(args = new String[3], args = new String[4]);
		main("Hello");
		addition();
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is overloaded main method with one int datatype parameter");
	}
	
	public static void main(int i) {
		System.out.println("This is overloaded main method with one int datatype parameter");
	}
	
	public static void main(String s1) {
		System.out.println("This is overloaded main method with one int datatype parameter");
	}
	
	public static void addition() {
		System.out.println("this is a normal static method");
	}
	
	//we have to overload this method addition
	
	public static void addition(int i) {
		System.out.println("Overloaded method with one int data type parameter");
	}
	
	public static void addition(int j, int k, String s1) {
		System.out.println("Overloaded method with two int data type parameter");
	}
	
	public static void addition(String s2) {
		System.out.println("Overloaded method with one int data type parameter");
	}

	
	


}
