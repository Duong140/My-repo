package com.java.Day8.oop.Inheritance;

public class Child_Class extends Parent_Class{
	
	public String jogging;
	public int hour;

	public static void main(String[] args) {
		Child_Class child = new Child_Class();
		child.jogging = "pace";
		child.hour = 20;
		child.Dog_walks();
		child.ant_walking();
		slug_walking();
		
		child.walking = "superfast";
		child.speed = 20;
		child.Cat_walking();
		child.Zabra_walking(); 
		
		Parent_Class.ladybug_walking();
		
		
		
		child.running = "Fast";
		child.time = 10;
		child.hamster_walking();
		child.mouse_walking();
		
		Grand_Parent_Class.rat_walking();
		
		
	}
	
	public void Dog_walks(){
			
			System.out.println("I am walking a dog!" + walking);
			
		}
	
	public void ant_walking() {
		System.out.println("i am walking my ant!");
	}
	
	public static void  slug_walking() {
		System.out.println("i am walking my slug!");
	}

}
