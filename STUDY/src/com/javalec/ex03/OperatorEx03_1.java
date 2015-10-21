package com.javalec.ex03;

public class OperatorEx03_1 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int result;
		
		result = ++a + --b * a--;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("result : " + result);
	}
}
