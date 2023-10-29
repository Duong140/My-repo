package com.ConstructorExample;

public class Car {
	
	String name;
	int horsepower;
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, int horsepower) {
		this.name = name;
		this.horsepower = horsepower;
	}

}
