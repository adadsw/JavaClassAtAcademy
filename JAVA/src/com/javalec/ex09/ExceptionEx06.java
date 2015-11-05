package com.javalec.ex09;

public class ExceptionEx06 {
	public static void main(String[] args) {
		try {
			// Exception e = new Exception("고의로 발생시켰음.");
			// throw e;
			throw new Exception("고의로 발생시켰음."); // 위의 두 줄을 한 줄로 줄여 쓸 수 있다.
		} catch (Exception e) {
			System.out.println("에러 메시지 :" + e.getMessage());
			e.printStackTrace();
		}
	}

}
