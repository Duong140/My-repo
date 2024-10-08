package LoopPrac;

import org.testng.annotations.Test;

public class arrays {
	

@Test 
 public void arrayloops(){


	
	String names[][] = {{"Erin McLean", "Mike La", "Kaiden La", "Hoang Nguyen"},
	{"Justing Arroyo", "Matthew Cruz", "Zack White"}};
	
	

	
	for(int i = 0; i < names.length; i++) {
		for(int j = 0; j < names[i].length; j ++) {
			System.out.println(names[i][j]);
		}
	}

		reverse_string res = new reverse_string();
		res.test_02();
		

}


	
}

