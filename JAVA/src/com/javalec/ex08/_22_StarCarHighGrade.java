package com.javalec.ex08;

public class _22_StarCarHighGrade extends _22_StarCar {

	_22_StarCarHighGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
	}

	void getSpec() {
		System.out.println("**********************");
		System.out.println("색상 : " + color);
		System.out.println("타이어 : " + tire);
		System.out.println("배기량 : " + displacement);
		System.out.println("핸들 : " + handle);
		
		if (displacement >= 2200)
			tax = 2200;
		
		System.out.println("세금 : " + tax);
		System.out.println("**********************");
	}
}
