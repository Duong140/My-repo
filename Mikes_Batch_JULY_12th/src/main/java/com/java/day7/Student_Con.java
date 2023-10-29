package com.java.day7;

public class Student_Con {
	
	String name;//default value oof a String is? null
	String subject;//null
	int student_id;//0 - default of an int is 0

	public static void main(String[] args) {
		Student_Con student1 = new Student_Con("Tom" , "Java" , 101); //default constructor which is not visible
		System.out.println(student1.name + " " + student1.subject + " " + student1.student_id );
		
		
		
		
		Student_Con student2 = new Student_Con("Mark" , "Python", 102);
		System.out.println(student2.name + " " + student2.subject + " " + student2.student_id);
		
		
		//Constructors are not entities of the class

	}
	
	
	
	public Student_Con(String name, String subject, int student_id){ //with arguments user defined constructor
		this.name = name;
		this.subject = subject;
		this.student_id = student_id;
	}

}
