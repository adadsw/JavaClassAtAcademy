package com.javalec.ex08;

public class _12_CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		// car.water();
		fe2 = (FireEngine) car;
		fe2.water();
		
		Ambulance ab = new Ambulance();
		ab.siren();
		car = ab;
//		car.siren();
		Ambulance ab2 = (Ambulance) car;
		ab2.siren();
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~~");
	}
}