package com.PolymorphismExample;

public class Polymorphism {

	public static void main(String[] args) {
		
		Car MyCar = new Car();
		MyCar.CarSound();
		
		GTR MyGTR = new GTR();
		MyGTR.CarSound();
		
		NSX MyNSX = new NSX();
		MyNSX.CarSound();

	}

}
