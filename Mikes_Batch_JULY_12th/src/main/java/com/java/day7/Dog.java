package com.java.day7;

public class Dog {
	
	String name;
	String color;
	int age;
	

	public static void main(String[] args) {
		Dog German = new Dog();
		
		German.name = "Riley";
		German.color = "Black";
		German.age = 6;
		
		
		German.initialize("Riley", "Black", 6);
		German.display();

	}
	
	public void initialize(String n, String c, int a) {
		
		name = n;
		color = c;
		age = a;
		
	
		
	}
	
	public void display() {
		System.out.println(name + " " + color + " " + age);
	}

}
