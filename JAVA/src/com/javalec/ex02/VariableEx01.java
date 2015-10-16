package com.javalec.ex02;

public class VariableEx01 {

	public static void main(String[] args) {
		
		System.out.println("변수란 무엇이든 담을 수 있는 공간이다.");
		
		int i = 10;
		int j = 20;
		int h = 0;
		char c1 = 'a';
		char c2 = 'b';
		char c3 = '^';
		String s = "하잉";
		//String은 객체 주소라서 대문자로 시작한다는데 무슨 원리지. 무튼 안녕이라는 문자열이 들어있는 주소값이 여기 들어간다.
		
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("h : " + h);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("s : " + s);
	}
}