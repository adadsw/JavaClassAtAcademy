package com.javalec.ex07;

public class _04_Student {
	public String name; // 이름
	public int grade; // 학년

	public _04_Student() {
		System.out.println("부모생성자 호출");
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}
	
	public String getInfo() {
		return "이름 : " + name + ", 학년 : " + grade;
	}
}
