package com.javalec.ex07;

public class _04_TestStudent {
	
	public static void main(String[] args) {
		_04_Middle middle = new _04_Middle("땅꼬마", 1);
		
		System.out.println(middle.getInfo());
		
		_04_College college = new _04_College("이효리", 3, 30);
		System.out.println(college.getInfo());
	}
	

}
