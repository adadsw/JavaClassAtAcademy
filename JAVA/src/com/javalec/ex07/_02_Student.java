package com.javalec.ex07;

public class _02_Student extends Object {
	
	public String name;
	public int grade;
	
	public _02_Student() {
		System.out.println("부모생성자 호출");
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getInfo() {
		return "이름 : " + name + " 학년 : " + grade;
	}

}
