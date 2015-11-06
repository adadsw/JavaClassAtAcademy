package com.javalec.ex10;

public class _05_WrapperTest {
	public static void main(String[] args) {
		System.out.println("int의 최대값>" + Integer.MAX_VALUE);
		System.out.println("int의 최소값>" + Integer.MIN_VALUE);
		
		String num = "123";
		String num2 = num + 2;
		System.out.println("num2>" + num2);
		int num3 = Integer.parseInt(num) + 2;
		System.out.println("num3>" + num3);
		
		int num4 = 123;
		String num5 = Integer.toString(num4);
		System.out.println("num5>" + num5);
	}
}
