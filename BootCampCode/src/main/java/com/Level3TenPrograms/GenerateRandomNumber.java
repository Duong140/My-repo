package com.Level3TenPrograms;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = rand.nextInt(300);
		
		System.out.println(num);
	}

}
