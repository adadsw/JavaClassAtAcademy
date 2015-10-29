package com.javalec.ex08;

public class _12_CastingTest1_1 {
	public static void main(String[] args) {
		Car2 car = new Car2();
		Car2 am = new Ambulance2();
		Car2 fe = new FireEngine2();
		
		car.drive(car);
		am.drive(am);
		fe.drive(fe);
	
	}
}

class Car2 {
	String color;
	int door;
	
	void drive(Car2 car) {
		if(car instanceof Ambulance2) {
			System.out.println("앰뷸런스 부르릉~");
		} else if(car instanceof FireEngine2) {
			System.out.println("소방차 부릉부릉~");
		}
		System.out.println("drive, Brrrr~");
	}
	
	void stop(Car2 car)	{
		if(car instanceof Ambulance2) {
			System.out.println("앰뷸런스 멈춘다~");
		} else if(car instanceof FireEngine2) {
			System.out.println("소방차 멈춘다~");
		}
		System.out.println("stop!!!");
	}
}
class FireEngine2 extends Car2 {
	void water() {
		System.out.println("water!!!");
	}
}

class Ambulance2 extends Car2 {
	void siren() {
		System.out.println("siren~~~");
	}
}
