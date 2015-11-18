package com.javalec.ex08;

public abstract class _22_StarCar {
	String color = "";
	String tire = "";
	int displacement;
	String handle = "";
	int tax = 1000;

	_22_StarCar(String color, String tire, int displacement, String handle) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}

	abstract void getSpec();
}