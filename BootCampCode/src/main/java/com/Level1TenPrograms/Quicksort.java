package com.Level1TenPrograms;

import java.util.Random;

public class Quicksort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
			
		}
		
		System.out.println("Before:");
		printArray(numbers);
		
		quicksort(numbers, 0, numbers.length - 1);
		
		System.out.println("\nAfter:");
		printArray(numbers);
	}
	
	private static void quicksort(int[] array, int lowIndex,int highIndex) {
		
		if(lowIndex >= highIndex) {
			return;
		}
		
		int pivot = array[highIndex];
		int LP = lowIndex;
		int RP = highIndex;
		
		while(LP < RP) {
			while(array[LP] <= pivot && LP < RP) {
				LP++;
			}
			while(array[RP] >= pivot && LP < RP) {
				RP--;
			}
			swap(array, LP, RP);
		}
		
		swap(array, LP, highIndex);
		
		quicksort(array, lowIndex, LP - 1);
		quicksort(array, LP + 1, highIndex);
		
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	private static void printArray(int[] numbers) {
		for(int i= 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
