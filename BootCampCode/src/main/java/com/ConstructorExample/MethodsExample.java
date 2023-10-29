package com.ConstructorExample;

public class MethodsExample {

	public static void main(String[] args) {
		Burger();
		Salad();
		Steak();

	}
	
	private static void Burger() {
		System.out.println("Burger with cheese please!");
	}
	
	protected static void Salad() {
		System.out.println("Can i have a salad please!");
	}
	
	public static void Steak() {
		System.out.println("May I have the steak please!");
	}
}
