package com.InterfacePractice;

public abstract class InterfaceImplements implements Car1Interface, CarInterface{
	

	
	
	@Override
	public void fillup() {
		
		for(int i = 0; i <= 2; i++) {
			System.out.println(model + " Car is Full of Gas! and it has " + miles + " on it!" );
			
		}

	}
	
	public void fillup1() {
		System.out.println(model1 + " Car is Full of Gas! and it has " + miles1 + " on it!");
		
	}
	
	}



