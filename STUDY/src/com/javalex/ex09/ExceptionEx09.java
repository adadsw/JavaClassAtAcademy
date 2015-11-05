package com.javalex.ex09;

public class ExceptionEx09 {
	public static void main(String[] args) {
		int num1 = 2, num2 = 3;
		try {
			int result = num1 - num2;
			if (result < 0)
				throw new Exception("잘못된 결과입니다.");
			System.out.println(result);
		} catch (Exception e) {
			String str = e.getMessage();
			System.out.println(str);
		}
	}

}
