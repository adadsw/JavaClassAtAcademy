package com.javalec.ex09;

public class ExceptionEx03 {
	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			System.out.println("1 2 입력");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 에러발생");
		} finally {
			System.out.println("에러발생 유무와 무관하게 반드시 수행된다.");
		}
		System.out.println("정상 종료");
	}
}
