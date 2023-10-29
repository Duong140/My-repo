package com.practice;

import org.testng.annotations.DataProvider;

public class Ninja_DP {
	
	@DataProvider
	public static Object[][] websites() {
		Object[][] Web = {  {"doung140@gmail.com", "password"},
						    {"doung1401@gmail.com", "password1"},
						    {"doung1402@gmail.com", "password2"},
						    {"doung1403@gmail.com", "password3"},
						    {"doung1404@gmail.com", "password4"}
						 };
						
		return Web;
	} 

}
