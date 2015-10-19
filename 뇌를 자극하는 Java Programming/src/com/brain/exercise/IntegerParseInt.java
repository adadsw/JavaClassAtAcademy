package com.brain.exercise;

public class IntegerParseInt {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("마");
			int num2 = Integer.parseInt("13");
			System.out.println(num + num2);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("정수가 아닌 값이 입력되었습니다.");
		}
	}

}
