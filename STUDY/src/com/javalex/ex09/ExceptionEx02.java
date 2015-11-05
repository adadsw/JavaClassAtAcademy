package com.javalex.ex09;

public class ExceptionEx02 {
	public static void main(String[] args) {
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		try {
			num[2] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("정상종료");
	}

}
