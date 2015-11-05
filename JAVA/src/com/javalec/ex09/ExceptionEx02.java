package com.javalec.ex09;

public class ExceptionEx02 {
	public static void main(String[] args) {
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		try {
			num[2] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잠온다");
		} catch (Exception e) {
			System.out.println("대빵 Exception");
		} finally {
			System.out.println("finally다");
		}
		System.out.println("정상종료");
	}

}
