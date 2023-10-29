package com.java.day9_oops_polymorphism_method_overiding;

public class School {

	public void library() {
		System.out.println("School's libary");
	}
	
	public void library(String AC) {
		System.out.println("School's libary with AC");
	}
	
	public void library(String AC, boolean examResults) {
		System.out.println("School's libary with Ac as well as exam center");
	}

}
