package com.brain.ch6;

public class InterfaceExample4 {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(100, 200, 10, 10);
		printRectangle(obj);
		obj.moveTo(25, 35);
		printRectangle(obj);
		obj.moveTo(-5, -5);
		printRectangle(obj);
		obj.moveTo(30, 30);
		printRectangle(obj);
	}
	static void printRectangle(Rectangle obj) {
		System.out.printf("사각형: 위치(%d, %d) 크기 (%d x %d) %n", obj.x, obj.y, obj.width, obj.height);
	}

}
