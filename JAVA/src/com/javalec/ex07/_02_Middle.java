package com.javalec.ex07;

public class _02_Middle extends _02_Student {
	
	public _02_Middle() {}
	public _02_Middle(String n, int g) {
		super(); // 부모 기본생성자
		System.out.println("Middle 생성자 호출");
		name = n;
		grade = g;
	}
}
