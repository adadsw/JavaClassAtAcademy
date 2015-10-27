package com.javalec.ex07;

public class _02_TestStudent {
	public static void main(String[] args) {
		// 클래스는 디자인이며, 이 디자인을 바탕으로 만들어진 메모리 공간이 객체이다.
		_02_Middle middle = new _02_Middle("소녀시대", 3);
		System.out.println(middle.getInfo());
		System.out.println(middle);
		
		_02_College college = new _02_College("장동건", 4, 20);
		System.out.println(college.getInfo() + " 학점 : " + college.getUnit());
	}
}
