package com.javalex.ex09;

public class ExceptionEx04 {
	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			num[2] = 3;
			System.out.println("1 2 3 입력");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 에러");
		} catch (Exception e) {
			System.out.println("그냥 익셉션");
		} finally {
			System.out.println("에러발생 유무와 무관하게 반드시 수행");
		}
		System.out.println("정상 종료");
	}

}
