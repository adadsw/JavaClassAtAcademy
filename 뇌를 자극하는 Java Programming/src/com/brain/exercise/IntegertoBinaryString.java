package com.brain.exercise;

public class IntegertoBinaryString {
	public static void main(String[] args) {
		String str;
		str = Integer.toBinaryString(12);
		System.out.println(str);
		
		str = Integer.toBinaryString(-37);
		System.out.println(str);
		str = Integer.toBinaryString(-5);
		System.out.println(str);
		str = Integer.toBinaryString(-127);
		System.out.println(str);
		str = Double.toHexString(3.14);
		System.out.println(str);
	}

}
