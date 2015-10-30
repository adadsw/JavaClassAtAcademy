package com.javalec.ex08;

public class _20_Middle extends _20_Student {

	public _20_Middle() {
		super.name = "ㅋㅋ";
		super.grade = 3;
	}
	
	public String getSchool() {
		return "ㅅㄷ 중학교";
	}
	
	public String getInfo() {
		return "이름은 " + name + ", 학년은 " + grade;
	}
}
