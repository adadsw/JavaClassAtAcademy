package com.javalec.ex09;

import java.io.*;

public class ExceptionEx11 {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("some.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
			}
			
		}
		System.out.println("정상 종료");
	}

}
