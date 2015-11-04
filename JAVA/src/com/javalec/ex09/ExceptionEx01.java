package com.javalec.ex09;

public class ExceptionEx01 {
	public static void main(String[] args) {
		
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		try {
			num[2] = 3;	
		} catch (Exception e2) {
			System.out.println("배열");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 에러");
		}
		System.out.println("정상 종료");
	}

}
