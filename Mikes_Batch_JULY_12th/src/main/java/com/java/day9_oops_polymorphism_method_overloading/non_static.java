package com.java.day9_oops_polymorphism_method_overloading;

public class non_static {

	public static void main(String[] args) {
		non_static nonstatic = new non_static();
		nonstatic.GTA(10);
		nonstatic.GTA(10, "hey");
		nonstatic.GTA("hello");
		nonstatic.GTA(20, 50);
		nonstatic.GTA(4, "Aye", 7);

	}
	
	public void GTA(int i) {
		System.out.println("non overloaded method");
	}
	
	public void GTA(int k, String s2) {
		System.out.println("overloaded method");
	}
	
	public void GTA(String s1) {
		System.out.println("another overloaded method");
	}
	
	public void GTA(int k, int i) {
		System.out.println("overloaded again");
	}
	
	public void GTA(int o, String s3, int l) {
		System.out.println("really over loaded");
	}

}
