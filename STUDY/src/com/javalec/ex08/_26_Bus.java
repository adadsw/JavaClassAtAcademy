package com.javalec.ex08;

public class _26_Bus implements _26_Car {

	@Override
	public void speedUp() {
		System.out.println("Bus speedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Bus speedDown");
	}

	@Override
	public void stop() {
		System.out.println("Bus Stop");
	}

}
