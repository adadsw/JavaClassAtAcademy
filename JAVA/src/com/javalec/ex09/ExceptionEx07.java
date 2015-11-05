package com.javalec.ex09;

public class ExceptionEx07 {
	public static void main(String[] args) {
		try {
			int result = add(1, -2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
	}
	static int add(int a, int b) throws Exception {
		int result = a + b;
		if (result < 0) 
			throw new Exception("에러 발생");
		return result;
	}
}
