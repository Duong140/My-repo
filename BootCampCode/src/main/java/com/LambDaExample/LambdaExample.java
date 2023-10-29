package com.LambDaExample;

public class LambdaExample {

	public static void main(String[] args) {
		
		
		InterfaceLambda Lambda = (J, I) -> System.out.println("Vroom" +  I + J);
		printMeth(Lambda);
		
				
				
			
			
		
				
		
	}
	
	
	public static void printMeth(InterfaceLambda meth) {
		meth.print("!", "!");
	}

}
