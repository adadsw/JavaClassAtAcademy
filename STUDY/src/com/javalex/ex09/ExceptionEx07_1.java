package com.javalex.ex09;

public class ExceptionEx07_1 {
	public static void main(String[] args) {
		try {
			int result = devide(3, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("에러 발생");
		}
	}
	static int devide(int a, int b) {
		int result = a / b;
		return result;
	}

}
