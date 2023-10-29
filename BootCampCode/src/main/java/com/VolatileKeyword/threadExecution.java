package com.VolatileKeyword;

public class  threadExecution {
	
	private static volatile int counter = 0;

	public static void main(String[] args) {
		
		Thread th1 = new Thread(() -> {
			int counting =  counter;
			
			while(counting < 10) {
				if(counting != counter) {
					System.out.println("th1 counter has changed" );
					counting = counter;
				}
			}
			
		});
		
		Thread th2 = new Thread(() -> {
			int counting =  counter;
			
			while(counting < 10) {
				System.out.println("th2 is incremented to " + (counting));
				counter = ++counting;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		
		th1.start();
		th2.start();

	}

}
