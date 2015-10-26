package com.javalec.ex07;

public class _02_TestStudent {
	public static void main(String[] args) {
		_02_Middle middle = new _02_Middle("소녀시대", 3);
		System.out.println(middle.getInfo());
		
		_02_College college = new _02_College("장동건", 4, 20);
		System.out.println(college.getInfo() + " 학점 : " + college.getUnit());
	}
	

}
