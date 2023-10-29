package com.TASessions;

public class Arrays {

	public static void main(String[] args) {
		
		
		String[] array1 =   {"Hey"};
		String[] array1_1 = {"there"};
		
		
		
		String[][] array2 = {  {"Mike", "Ed"},
							   {"Kaiden", "Lexxi"},
							   {"Erin", "Bob" }
							};	
		String[][] array2_1 = {  {"lets go for a run", "lets go for a jog"},
							     {"lets go for a walk", "lets go  for a fast walk"}
							  };
		
		
		
		String[][][] array3 =  {    {{"right now","immediately", "right away"}, {"Asap", "as soon as possible", "real fast"}},
								    {{"later", "in twenty minutes", "in ten minutes"}, {"in five minutes", "in two minutes", "in three minutes"}}
							   };
		String[][][] array3_1 =  {  {{"ma'am!", "miss!", "girl!"}, {"chica!", "madam!", "lady!"}},
				 				    {{"sir!", "mister!", "bro!"}, {"homie!", "guy!", "dude!"}}
							   };
		
		System.out.println(array1[0] + " " + array1_1[0] + " " + array2[0][1] + " " + array2_1[0][1] + " " + array3[1][1][2] + " " + array3_1[1][0][1]);
		
		System.out.println(array1[0] + " " + array1_1[0] + " " + array2[1][1] + " " + array2_1[1][1] + " " + array3[1][0][2] + " " + array3_1[0][1][0]);
		
		System.out.println(array1[0] + " " + array1_1[0] + " " + array2[2][1] + " " + array2_1[0][1] + " " + array3[1][0][1] + " " + array3_1[1][1][2]);
		
		
		
		
		
		

	}

}
