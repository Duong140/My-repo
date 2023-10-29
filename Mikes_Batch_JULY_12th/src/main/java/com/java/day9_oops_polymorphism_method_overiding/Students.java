package com.java.day9_oops_polymorphism_method_overiding;

public class Students extends School {
	
	public static void main(String[] args) {
		Students student = new Students();
		student.library();
		student.library("Hitachi");
		student.library("Bluestar", true);
		
		School school = new School();
		school.library();
		school.library("HEY");
		school.library("Hello", false);
		
		
		
	}
	
	public void library() {
		System.out.println("School's ");
	}
	
	public void library(String AC) {
		System.out.println("School's ");
	}
	
	public void library(String AC, boolean examResults) {
		System.out.println("School's libary ");
	}

}


