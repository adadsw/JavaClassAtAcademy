package com.brain.ch5;

public class MethodExample4 {
	public static void main(String[] args) {
		int arr[] = new int[0];
		Numbers obj = new Numbers(arr);
		try {
			int average = obj.getAverage();
			System.out.println("평균 = " + average);
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("평균을 계산하는 도중 에러가 발생했습니다.");
		}
	}

}
