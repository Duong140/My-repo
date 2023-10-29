package com.InterfaceExample;

public class InterfaceExp implements CarInterface {

	public static void main(String[] args) {
		
		InterfaceExp Infiniti = new InterfaceExp();
		Infiniti.Q50();
	}

	@Override
	public void Q50() {
		System.out.println("Details on this vehicle are, color is " + color + ",miles are " + mileage + ",power is " + Horsepower + "!");
		
	}

}
