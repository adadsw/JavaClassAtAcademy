package com.javalec.ex08;

public abstract class _20_Student {
	
	public String name;
	public int grade;
	
	public _20_Student() {
		System.out.println("Student 부모 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public abstract String getInfo();
	public abstract String getSchool();

}
