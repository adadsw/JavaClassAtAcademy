package com.javalec.ex09;

public class ExceptionEx05 {
	public static void main(String[] args) {
		Throw t = new Throw();
		
		try {
			t.go();
		} catch (Exception e) {
			System.out.println("main() : catch(IOException" + e);
		}
	}

}

class Throw {
	public void go() { //throws Exception {
		System.out.println("go() 시작");
		
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;	
		
		System.out.println("배열 인덱스 에러");
		
		System.out.println("1 2 3 입력");
	}
}