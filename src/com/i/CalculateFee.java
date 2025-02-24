package com.i;

public class CalculateFee implements ParkingLot {

	@Override
	public void parkCar() {
	
	}
	
	@Override
	public void unparkCar() {
	
	}
	
	@Override
	public void getCapacity() {
	
	}
	
	@Override
	public double calculateFee(Car car) {	
		return 0;
	}
	
	public void doPayment (Car car) throws Exception {
	
	throw new Exception("Parking lot is free");
	}
}