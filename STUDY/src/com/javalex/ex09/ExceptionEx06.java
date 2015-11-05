package com.javalex.ex09;

public class ExceptionEx06 {
	public static void main(String[] args) {
		try {
			throw new Exception("고의로 발생시켰음.");
		} catch (Exception e) {
			System.out.println("에러 메시지 :" + e.getMessage());
			e.printStackTrace();
		}
	}

}
