package com.java.day9_oops_polymorphism_Abstraction;

public class Test extends UnitedFlightBookingLogic  {

	public static void main(String[] args) {
		
		//UnitedFlightBookingLogic ufb = new UnitedFlightBookingLogic ();
		UnitedFlightBookingLogic  ref = new Test();
		
		ref.flightArrivalLogic();
		
		
		Test test = new Test();
	}

	@Override
	public void flightDepartureLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flightBookingLogic() {
		// TODO Auto-generated method stub
		
	}

}
