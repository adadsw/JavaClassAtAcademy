package com.javalec.ex08;

public class _26_Truck implements _26_Car {

	@Override
	public void speedUp() {
		System.out.println("Truck speedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Truck speedDown");
	}

	@Override
	public void stop() {
		System.out.println("Truck stop");
	}
	
}
