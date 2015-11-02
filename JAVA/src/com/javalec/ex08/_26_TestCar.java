package com.javalec.ex08;

public class _26_TestCar {
	public static void main(String[] args) {
		
		// Car c = new Car();
		_26_Car c = new _26_SportsCar();
		_26_Car t = new _26_Truck();
		_26_Car b = new _26_Bus();
		
		// SportsCar
		c.speedUp();
		c.speedDown();
		c.stop();
		
		// Truck
		t.speedUp();
		t.speedDown();
		t.stop();
		
		// Bus
		b.speedUp();
		b.speedDown();
		b.stop();
	}

}
