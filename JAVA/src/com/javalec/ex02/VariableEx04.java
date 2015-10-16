package com.javalec.ex02;

public class VariableEx04 {

	public static void main(String[] args) {
	
		char c = 'H';
		int i = 10;
		double d = 3.14D;
		boolean b = true;
		
		System.out.println("c: " + c);
		System.out.println("i: " + i);
		System.out.println("d: " + d);
		System.out.println("b: " + b);
		
		int i1 = 10;
		double d1 = i1; //묵시적 형 변환 int -> double
		System.out.println("d1: " + d1);
		
		double d2 = 10.00;
		int i2 = (int)d2; //명시적 형 변환 double -> int
		System.out.println("d2: " + d2);
		System.out.println("i2 " + i2);
	}	
}
