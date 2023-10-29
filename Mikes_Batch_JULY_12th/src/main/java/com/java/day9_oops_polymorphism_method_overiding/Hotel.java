package com.java.day9_oops_polymorphism_method_overiding;

public class Hotel extends Room {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		hotel.Room123();
		
		Room room = new Room();
		room.Room123();
		

	}
	
	public void Room123() {
		System.out.println("This is my room number");
	}
	
	public void Room123(int i) {
		System.out.println("This is my room number1");
	}
	
	public void Room123(int i, int k) {
		System.out.println("This is my room number2");
	}
	
	public void Room123(int i,String s1) {
		System.out.println("This is my room number3");
	}
	
	public void Room123(int i,String s2, int y) {
		System.out.println("This is my room number4");
	}

	

}
