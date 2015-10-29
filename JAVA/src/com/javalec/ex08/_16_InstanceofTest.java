package com.javalec.ex08;

public class _16_InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
	
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
	}
}
