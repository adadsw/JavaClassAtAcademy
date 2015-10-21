package com.javalec.ex03;

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int a = 1000000;
		int b = 2000000;
		int c1 = a * b;
		long c2 = a * b;
		long c3 = (long)a * b;
		long c4 = (long)(a * b);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
