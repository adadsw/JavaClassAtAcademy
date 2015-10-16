package com.javalec.ex03;

public class OperatorEx06 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 20;
		// byte c = a + b; // byte c = int + int
		// byte c = (byte)a + b; //
		byte c = (byte) (a + b); //명시적 형변환을 해줍니다.
		System.out.println(c); // 30
	}
}
