package com.SuperKeywordExample;

public class Car extends RareCars {
	
	@Override
	public void GTR() {
		super.GTR();
		System.out.println("The GTR is worth over $100k");
	}
	
	@Override
	public void NSX() {
		super.NSX();
		System.out.println("The NSX is worth over $130k");

	

}
	
	public void revEngine() {
		super.revEngine();
		System.out.println("PURR! PURR! PURR!");
	}
}
