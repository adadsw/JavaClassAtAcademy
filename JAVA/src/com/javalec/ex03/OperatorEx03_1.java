package com.javalec.ex03;

public class OperatorEx03_1 {

	public static void main(String[] args) {

		int a = 2, b = 3, result;
		result = a++ + b-- * a--;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("result : " + result);

	}
}
