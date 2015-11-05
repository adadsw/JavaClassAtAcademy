package com.javalec.ex09;

import java.io.IOException;

public class ExceptionEx05_1 {
	public static void main(String[] args) {
		Throw1 t = new Throw1();
		
		try {
			t.go();
		} catch(IOException e) {
//			System.out.println("main() : catch(IOException" + e);
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상종료!!");
		
	}
}

class Throw1 {
	public void go() throws IOException {
		System.out.println("go() 시작");
		
	
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		
		if (num.length == 2) throw new IOException("배열크기가 2");
	}
}
